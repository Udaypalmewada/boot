package com.boot.intializer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.intializer.dao.IStudentDao;
import com.boot.intializer.model.Student;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentDao StudentDao;

	@Override
	public void add(Student student) {
		StudentDao.addStudent(student);
	}

	@Override
	public void delete(int id) {
		StudentDao.deletStudent(id);
	}

	@Override
	public Student getById(int id) {
		return StudentDao.getById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return StudentDao.allStudent();
	}

	@Override
	public void edit(Student student) {
		StudentDao.updateStudent(student);
	}

}
