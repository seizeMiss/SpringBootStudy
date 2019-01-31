package com.dragon.spring.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

// 指定这是一个操作数据库的mapper
@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> findAllStudent();

    @Select("select * from student where name=#{name}")
    Student findStudentByName(String name);
}
