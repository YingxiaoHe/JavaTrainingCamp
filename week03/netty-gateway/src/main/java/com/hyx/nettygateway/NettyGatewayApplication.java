package com.hyx.nettygateway;

import com.hyx.nettygateway.inbound.HttpInboundServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@Slf4j
//@SpringBootApplication
public class NettyGatewayApplication {

    public final static String GATEWAY_NAME = "NIOGateway";
    public final static String GATEWAY_VERSION = "3.0.0";

    public static void main(String[] args) {
//        SpringApplication.run(NettyGatewayApplication.class, args);

        String proxyPort = System.getProperty("proxy", "8888");

        String proxyServers = System.getProperty("proxyServers",
                "http://localhost:8801,http://localhost:8802,http://localhost:8803");
        int port = Integer.parseInt(proxyPort);
        log.info("{} {} starting", GATEWAY_NAME, GATEWAY_VERSION);
        HttpInboundServer server = new HttpInboundServer(port, Arrays.asList(proxyServers.split(",")));
        log.info("{} {} started at http://localhost:{} for server:{}", GATEWAY_NAME, GATEWAY_VERSION, port, server);
        try {
            server.run();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
