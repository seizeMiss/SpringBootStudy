package com.dragon.spring.custombean.config;

import com.dragon.spring.custombean.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类是一個配置类；就是來替代之前的spring配置文件
 *
 * 在配置文件中用<bean></bean>标签添加組件
 */
@Configuration
public class MyAppConfig {
    // 将方法的返回值添加到容器中；容器中這個組件默认的id就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("配置bean， helloService");
        return new HelloService();
    }
}
