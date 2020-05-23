package com.boot.intializer.dao;

import java.util.List;

import com.boot.intializer.model.Student;

public interface IStudentDao {
	public void addStudent(Student student);

	public List<Student> allStudent();

	public Student getById(int id);

	public Student updateStudent(Student student);

	public void deletStudent(int id);
}
