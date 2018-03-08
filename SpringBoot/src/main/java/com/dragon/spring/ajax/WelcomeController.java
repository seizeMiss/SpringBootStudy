package com.dragon.spring.ajax;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 使用  @Controller 注解，String 返回的是前端页面的名称
 * @author 
 *
 */
@Controller
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> model) {
        return "ajax";
    }
}