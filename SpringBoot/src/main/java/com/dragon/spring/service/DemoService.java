package com.dragon.spring.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.dragon.spring.annocation.Log;

@Service(value="demoService")
@ComponentScan
public class DemoService {
	
	@Log
	public void run(){
		
	}
}
