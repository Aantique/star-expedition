package com.jojo.golden.experience.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Clozer
 * @date 2022/3/30 11:17
 */
@RequestMapping("/test")
@RestController
public class DiscoverTest {

    @Value("${server.port}")
    private String port;

    @GetMapping("/discover/{str}")
    public String discover(@PathVariable String str){
        return str + port;
    }
}
