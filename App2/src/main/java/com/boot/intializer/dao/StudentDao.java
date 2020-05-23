package com.boot.intializer.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.boot.intializer.model.Student;
@Service
public class StudentDao implements IStudentDao {
 
  JdbcTemplate jdbcTamplate;
  
  
 

public void setJdbcTamplate(DataSource dataSource) {
	jdbcTamplate = new JdbcTemplate(dataSource);
}

@Override
	public void addStudent(Student student) {
	String sql="";
		jdbcTamplate.update(sql);
	}

	@Override
	public List<Student> allStudent() {
		return null;
	}

	@Override
	public Student getById(int id) {
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		return null;
	}

	@Override
	public void deletStudent(int id) {
		
	}
	

}
