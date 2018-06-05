package com.dragon.spring.demo.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.dragon.spring.demo.annocation.Log;

@Service(value="demoService")
@ComponentScan
public class DemoService {
	private Logger logger = LogManager.getLogger(DemoService.class);
	@Log
	public void run(){
		logger.info("DemoService run方法");
	}
}
