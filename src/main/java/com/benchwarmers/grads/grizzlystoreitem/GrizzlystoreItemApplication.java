package com.benchwarmers.grads.grizzlystoreitem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GrizzlystoreItemApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrizzlystoreItemApplication.class, args);
    }

}
