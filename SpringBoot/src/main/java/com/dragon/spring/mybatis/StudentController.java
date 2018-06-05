package com.dragon.spring.mybatis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("mybatis-student")
public class StudentController {
    @Resource
    private StudentService studentService;

    private final static Logger log = LogManager.getLogger(StudentController.class);

    @RequestMapping("/list")
    public List<Student> findAll(){
        return studentService.findAll();
    }

    @RequestMapping("/list/{name}")
    public Student findAll(@PathVariable String name){
        log.error("name:" + name);
        return studentService.findByName(name);
    }
}
