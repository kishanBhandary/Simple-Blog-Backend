package com.Simple.Blog.Backend.Simple.Blog.Backend.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthCheck")
public class HealthCheck {
    public String checkHealth(){
        return "Everything is OK";
    }

}
