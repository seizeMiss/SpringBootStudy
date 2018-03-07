package com.dragon.spring.ajax;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        return "ajax";
    }
}