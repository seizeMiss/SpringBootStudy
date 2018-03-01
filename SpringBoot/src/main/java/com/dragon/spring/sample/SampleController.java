package com.dragon.spring.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SampleController {
	
//	@Autowired(required=true)
//	private DemoService demoService;
	
	@RequestMapping("/1")
	@ResponseBody
	String home(){
//		demoService.run();
		return "hello world!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SampleController.class, args);
	}

}
