package com.imooc.product.controller;

import com.imooc.product.config.BoyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ServerController {
    @Value("${env}")
    private String env;
    @Autowired
    private BoyConfig boyConfig;

    @GetMapping("/msg")
    public String msg() {
        return "this is product' msg";
    }

    @GetMapping("/print")
    public String print() {
        return env;
    }

    @GetMapping("/boy")
    public String boy() {
        return boyConfig.toString();
    }
}
