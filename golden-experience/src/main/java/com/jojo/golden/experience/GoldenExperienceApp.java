package com.jojo.golden.experience;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Clozer
 * @date 2022/3/30 11:16
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GoldenExperienceApp {
    public static void main(String[] args) {
        SpringApplication.run(GoldenExperienceApp.class,args);
    }
}
