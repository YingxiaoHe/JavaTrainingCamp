package com.example.rpcfxdemoprovider;

import com.example.rpcfxcore.api.RpcfxRequest;
import com.example.rpcfxcore.api.RpcfxResolver;
import com.example.rpcfxcore.api.RpcfxResponse;
import com.example.rpcfxcore.api.ServiceProviderDesc;
import com.example.rpcfxcore.exception.RpcfxException;
import com.example.rpcfxcore.server.RpcfxInvoker;
import com.example.rpcfxdemoapi.OrderService;
import com.example.rpcfxdemoapi.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.net.InetAddress;

@Slf4j
@SpringBootApplication
public class RpcfxDemoProviderApplication {

    public static void main(String[] args) throws Exception {

        // start zk client
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.builder().connectString("localhost:2181").namespace("rpcfx").retryPolicy(retryPolicy).build();
        client.start();


        // register service
        String userService = "com.example.rpcfxdemoapi.UserService";
        registerService(client, userService);
        String orderService = "com.example.rpcfxdemoapi.OrderService";
        registerService(client, orderService);

        SpringApplication.run(RpcfxDemoProviderApplication.class, args);
    }

    private static void registerService(CuratorFramework client, String service) throws Exception {
        ServiceProviderDesc userServiceSesc = ServiceProviderDesc.builder()
                .host(InetAddress.getLocalHost().getHostAddress())
                .port(8081).serviceClass(service).build();

        try {
            if (null == client.checkExists().forPath("/" + service)) {
                client.create().withMode(CreateMode.PERSISTENT).forPath("/" + service, "service".getBytes());
            }
        } catch (RpcfxException ex) {
            log.error("", ex);
        }

        client.create().withMode(CreateMode.EPHEMERAL).
                forPath("/" + service + "/" + userServiceSesc.getHost() + "_" + userServiceSesc.getPort(),
                        "provider".getBytes());
    }

    @Autowired
    RpcfxInvoker invoker;

    @PostMapping("/")
    public RpcfxResponse invoke(@RequestBody RpcfxRequest request) {
        return invoker.invoke(request);
    }

    @Bean
    public RpcfxInvoker createInvoker(@Autowired RpcfxResolver resolver) {
        return new RpcfxInvoker(resolver);
    }

    @Bean
    public RpcfxResolver createResolver() {
        return new DemoResolver();
    }

    @Bean(name = "com.example.rpcfxdemoapi.UserService")
    public UserService createUserService() {
        return new UserServiceImpl();
    }

    @Bean(name = "com.example.rpcfxdemoapi.OrderService")
    public OrderService createOrderService() {
        return new OrderServiceImpl();
    }

}
