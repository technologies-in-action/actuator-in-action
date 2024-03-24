package com.github.yunfeng.actuatorinaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/test")
    public Integer get() {
        return 0;
    }
}
