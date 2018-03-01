package com.dragon.spring.annocation.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	@Pointcut("@annotation(com.dragon.spring.annocation.Log)")
	private void cut() { }
	
	@Around("cut()")
	public void advice(ProceedingJoinPoint joinPoint){
	    System.out.println("环绕通知之开始");
	    try {
	        joinPoint.proceed();
	    } catch (Throwable e) {
	        e.printStackTrace();
	    }
	    System.out.println("环绕通知之结束");
	}
}
