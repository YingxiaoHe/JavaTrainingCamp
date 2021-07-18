package com.example.rpcfxdemoconsumer;

import com.example.rpcfxcore.api.Filter;
import com.example.rpcfxcore.api.LoadBalancer;
import com.example.rpcfxcore.api.Router;
import com.example.rpcfxcore.api.RpcfxRequest;
import com.example.rpcfxcore.client.Rpcfx;
import com.example.rpcfxdemoapi.Order;
import com.example.rpcfxdemoapi.OrderService;
import com.example.rpcfxdemoapi.User;
import com.example.rpcfxdemoapi.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Random;

@Slf4j
@SpringBootApplication
public class RpcfxDemoConsumerApplication {

    public static void main(String[] args) {

        UserService userService = Rpcfx.create(UserService.class, "http://localhost:8081/");
        User user = userService.findById(1);
        log.info("find user id=1 from server: {}", user.getName());

        OrderService orderService = Rpcfx.create(OrderService.class, "http://localhost:8081/");
        Order order = orderService.findOrderById(1992129);
        log.info("find order name={}, amount={}", order.getName(), order.getAmount());


        UserService userService2 = Rpcfx.createFromRegistry(UserService.class, "localhost:2181", new TagRouter(), new RandomLoadBalancer(), new HyxFilter());

        SpringApplication.run(RpcfxDemoConsumerApplication.class, args);
    }

    private static class TagRouter implements Router {
        @Override
        public List<String> route(List<String> urls) {
            return urls;
        }
    }

    private static class RandomLoadBalancer implements LoadBalancer {
        @Override
        public String select(List<String> urls) {
            return urls.get(new Random(urls.toArray().length).nextInt());
//            return urls.get(0);
        }
    }

    @Slf4j
    private static class HyxFilter implements Filter {
        @Override
        public boolean filter(RpcfxRequest request) {
            log.info("filter {} -> {}", this.getClass().getName(), request.toString());
            return true;
        }
    }

}
