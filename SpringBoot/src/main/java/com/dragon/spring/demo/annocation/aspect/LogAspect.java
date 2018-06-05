package com.dragon.spring.demo.annocation.aspect;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	private Logger logger = LogManager.getLogger(LogAspect.class);

	@Pointcut("@annotation(com.dragon.spring.demo.annocation.Log)")
	private void cut() { }
	
	@Around("cut()")
	public void advice(ProceedingJoinPoint joinPoint){
		logger.info("环绕通知之开始");
	    try {
	        joinPoint.proceed();
	    } catch (Throwable e) {
	        e.printStackTrace();
	    }
	    logger.info("环绕通知之结束");
	}
}
