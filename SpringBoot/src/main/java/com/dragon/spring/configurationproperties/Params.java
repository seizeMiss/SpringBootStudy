package com.dragon.spring.configurationproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/**
 * 简单配置
 * @author dragon-pc
 *
 */
@Component
@PropertySource("classpath:param.properties")
public class Params {
	/**
	 * <bean class="Params">
	 *  	<property name="threadPoll" value="${key}"></property>
	 * </bean>
	 */
	@Value("${thread-pool}")
    private int threadPool;

    @Value("${email}")
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
