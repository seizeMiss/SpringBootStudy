package com.dragon.spring.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/**
 * scanBasePackages 扫描包的路径，使注解生效
 * exclude 数据源自动配置
 * @author chenbaolong
 *
 */
@SpringBootApplication(scanBasePackages="com.dragon.spring.demo",exclude={DataSourceAutoConfiguration.class})
public class SpingBootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingBootTestApplication.class, args);
	}
}
