package com.boot.intializer.service;

import java.util.List;

import com.boot.intializer.model.Student;

public interface IStudentService {
	public void add(Student student);
	public Student getById(int id);
	public List<Student>getAllStudent();


	public void edit(Student student);
	 public void delete(int id);
}
