package com.dragon.spring.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAllStudent();

    @Select("select * from student where name=#{name}")
    Student findStudentByName(String name);
}
