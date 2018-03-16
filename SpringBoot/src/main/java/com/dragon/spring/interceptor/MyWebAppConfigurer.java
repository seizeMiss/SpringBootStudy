package com.dragon.spring.interceptor;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyWebAppConfigurer extends WebMvcConfigurerAdapter{
	
	@Resource(name="myInterceptor1")
	private HandlerInterceptor interceptor1;
	
	@Resource(name="myInterceptor2")
	private HandlerInterceptor interceptor2;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		 // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
//		WebApplicationContextUtils.getRequiredWebApplicationContext(re)
		registry.addInterceptor(interceptor1).addPathPatterns("/index");
		registry.addInterceptor(interceptor2).addPathPatterns("/aa");
		super.addInterceptors(registry);
	}
}
