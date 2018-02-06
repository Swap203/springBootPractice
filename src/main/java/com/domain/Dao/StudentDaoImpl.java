package com.domain.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.domain.Entity.Student;


@Repository
@Qualifier("coll")
public class StudentDaoImpl implements StudentDao {
	
	private static Map<Integer, Student> students;
	
	
	static {
		
		students=new HashMap<Integer, Student>(){
			{
				put(1, new Student(1,"Swapnil","Computer Science"));
				put(2, new Student(2,"Vaibhav","Mechatronics"));
				put(3, new Student(3,"Dhig","Printing Tech"));
			}
		};
	}
	
	
	/* (non-Javadoc)
	 * @see com.domain.Dao.StudentDao#getAllStudents()
	 */
	public Collection<Student> getAllStudents()
	{
		return this.students.values();
		
	}
	
	/* (non-Javadoc)
	 * @see com.domain.Dao.StudentDao#getStudentById(int)
	 */
	public Student getStudentById(int id){
		
		return this.students.get(id);
	}

	/* (non-Javadoc)
	 * @see com.domain.Dao.StudentDao#deleteStudentById(int)
	 */
	public void deleteStudentById(int id) {
		// TODO Auto-generated method stub
		this.students.remove(id);
	}

	/* (non-Javadoc)
	 * @see com.domain.Dao.StudentDao#addStudent(com.domain.Entity.Student)
	 */
	public void addStudent(Student student) {

		students.put(student.getId(), student);
		
	}

	/* (non-Javadoc)
	 * @see com.domain.Dao.StudentDao#updateStudent(com.domain.Entity.Student)
	 */
	public void updateStudent(Student student) {

		Student s= students.get(student.getId());
		
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		students.put(s.getId(), s);
	}
	
	
	
	
	
	
}
