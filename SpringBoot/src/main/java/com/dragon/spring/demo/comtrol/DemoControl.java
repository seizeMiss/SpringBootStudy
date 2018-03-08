package com.dragon.spring.demo.comtrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragon.spring.demo.service.DemoService;

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
