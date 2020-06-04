package com.server_cunsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Server_ProviderApplication {
    public static void main(String [] args){
        SpringApplication.run(Server_ProviderApplication.class);
    }

}
