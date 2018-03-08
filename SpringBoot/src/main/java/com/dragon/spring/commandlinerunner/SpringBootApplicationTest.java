package com.dragon.spring.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
/**
 * 实现  CommandLineRunner 接口，可以在项目启动时加载数据
 * 如果有多个类实现 CommandLineRunner 接口，可以使用  @Order 的注解表明运行顺序
 * @author 
 *
 */
@Order(value=1)
public class SpringBootApplicationTest implements CommandLineRunner{

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("SpringBootApplicationTest run");
		System.out.println(arg0.toString());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationTest.class, args);
	}
	/**
	 * 已经配置 Tomcat后，如果不加 servlet 容器 会影响该 类的运行
	 * 配置对应的web服务器，返回对应的 bean
	 * @return
	 */
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
	       
	    TomcatEmbeddedServletContainerFactory factory = new TomcatEmbeddedServletContainerFactory();
	    return factory;
	       
	}

}