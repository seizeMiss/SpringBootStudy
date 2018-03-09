package com.dragon.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Student> listStudent(){
		List<Student> students = null;
		String sql = "select id,name,age from student";
		long time = System.currentTimeMillis();
		students = jdbcTemplate.query(sql, new RowMapper<Student>(){
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setAge(rs.getInt("age"));
				return student;
			}
		});
		System.out.println("执行查询数据库的时间：" + (System.currentTimeMillis() - time));
		return students;
	}

}
