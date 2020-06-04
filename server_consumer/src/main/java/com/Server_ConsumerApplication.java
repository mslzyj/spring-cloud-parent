package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Server_ConsumerApplication {
    public static void main(String [] args){
        SpringApplication.run(Server_ConsumerApplication.class);
    }
}
