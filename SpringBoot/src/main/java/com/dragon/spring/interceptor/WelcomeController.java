package com.dragon.spring.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.WebApplicationContextUtils;

@RestController
public class WelcomeController {
	
	@Autowired
	private InterceptorService interceptorService;

    @RequestMapping("/index")
    public String welcome(HttpServletRequest request,Map<String, Object> model) {
        // 手动获取 InterceptorService bean
//    	interceptorService = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext()).getBean(InterceptorService.class);
    	interceptorService.testInterceptor();
    	return "hello interceptor";
    }
}
