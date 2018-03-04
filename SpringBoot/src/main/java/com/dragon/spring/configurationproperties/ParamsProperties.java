package com.dragon.spring.configurationproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:param.properties")
@ConfigurationProperties
public class ParamsProperties {
	private int threadPool;
    private String email;
	public int getThreadPool() {
		return threadPool;
	}
	public void setThreadPool(int threadPool) {
		this.threadPool = threadPool;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
