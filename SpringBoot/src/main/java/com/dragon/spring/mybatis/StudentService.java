package com.dragon.spring.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> findAll(){
        return studentMapper.findAllStudent();
    }

    public Student findByName(String name){
        return studentMapper.findStudentByName(name);
    }
}
