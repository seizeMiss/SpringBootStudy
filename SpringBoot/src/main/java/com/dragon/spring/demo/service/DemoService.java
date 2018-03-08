package com.dragon.spring.demo.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.dragon.spring.demo.annocation.Log;

@Service(value="demoService")
@ComponentScan
public class DemoService {
	
	@Log
	public void run(){
		System.out.println("DemoService run方法");
	}
}
