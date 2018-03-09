package com.dragon.spring.jdbc;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
	private static Logger logger = LogManager.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;

	@RequestMapping("list")
	public List<Student> listStudents(){
		logger.error("error listStudent....");
		logger.debug("debug listStudent....");
		logger.fatal("fatal listStudent()....");
		logger.info("StudentController listStudent()....");
		return studentService.listStudent();
	}
}
