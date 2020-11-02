package com.arrayindex.consulconfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigurationProperties (value = AppConfig.class)
public class ConsulConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulConfigurationApplication.class, args);
    }

}
