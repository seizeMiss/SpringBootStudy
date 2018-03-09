package com.dragon.spring.interceptor;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/index")
    public String welcome(Map<String, Object> model) {
        // 
    	return "hello interceptor";
    }
}
