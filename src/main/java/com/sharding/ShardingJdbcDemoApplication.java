package com.sharding;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication
public class ShardingJdbcDemoApplication {

    public static void main(String[] args) throws UnknownHostException {
        final ConfigurableApplicationContext context = SpringApplication.run(ShardingJdbcDemoApplication.class, args);
        final String hostAddress = InetAddress.getLocalHost().getHostAddress();
        final ConfigurableEnvironment environment = context.getEnvironment();
        final Integer port = environment.getProperty("server.port", Integer.class);
        String contextPath = environment.getProperty("server.servlet.context-path", String.class);
        log.info("基准方中CRM系统接口文档地址: http://{}:{}{}/doc.html", hostAddress, port, contextPath);
        log.info("--------基准方中CRM系统启动成功>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

}
