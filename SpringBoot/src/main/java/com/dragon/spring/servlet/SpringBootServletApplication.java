package com.dragon.spring.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@ServletComponentScan(basePackages="com.dragon.spring.servlet")
public class SpringBootServletApplication {
	/**
	 * 使用代码注册Servlet（不需要@ServletComponentScan注解）
	 * @return
	 */
	@Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new MyServlet(), "/*");// ServletName默认值为首字母小写，即myServlet
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletApplication.class, args);
    }
}
