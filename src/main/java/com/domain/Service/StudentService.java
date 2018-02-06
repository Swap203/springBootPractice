package com.domain.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.domain.Dao.StudentDao;
import com.domain.Entity.Student;


@Service
public class StudentService {

	@Autowired
	@Qualifier("coll")
	private StudentDao studentDao;
	
	public Collection<Student> getAllStudents()
	{
		return this.studentDao.getAllStudents();
	}
	
	
	public Student getStudentById(int id){
		
		return this.studentDao.getStudentById(id);
	}


	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		this.studentDao.deleteStudentById(id);
	}


	public void addStudent(Student student) {
		this.studentDao.addStudent(student);
		
	}


	public void updateStudent(Student student) {
		this.studentDao.updateStudent(student);
		
	}
	
	
}
