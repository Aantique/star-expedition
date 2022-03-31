package com.jojo.hermit.purple;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Clozer
 * @date 2022/3/30 14:00
 */
@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
public class HermitPurpleApp {
    public static void main(String[] args) {
        SpringApplication.run(HermitPurpleApp.class,args);
    }
}
