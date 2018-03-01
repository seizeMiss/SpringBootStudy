package com.dragon.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.spring.service.DemoService;

@RestController
@RequestMapping("/aop")
public class DemoControl {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/test")
    public String run(){
        demoService.run();
        return "Controller completed!";
    }

}
