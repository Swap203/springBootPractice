package com.domain.Dao;

import java.util.Collection;

import com.domain.Entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	void deleteStudentById(int id);

	void addStudent(Student student);

	void updateStudent(Student student);

}