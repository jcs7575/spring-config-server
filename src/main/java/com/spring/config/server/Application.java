package com.spring.config.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Jerry on 2016/9/13.
 */
@SpringBootApplication
@EnableConfigServer
public class Application {
        public static void main(String[] args) {
                new SpringApplicationBuilder(Application.class).web(true).run(args);
        }

}
