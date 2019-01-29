package com.dragon.spring.configwebmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// 使用WebMvcConfigurerAdapter可以来扩展SpringMvc的功能

// 全面接管SpringMVC,所有的SpringMVC的自动配置都失效
// @EnableWebMvc
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter
{
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        // 浏览器发送 /dragon 请求到 welcome
        registry.addViewController("/dragon").setViewName("welcome");
    }
}
