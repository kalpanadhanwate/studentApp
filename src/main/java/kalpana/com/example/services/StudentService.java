package kalpana.com.example.services;

import java.util.List;

import kalpana.com.example.model.Student;

public interface StudentService {
	
	Student saveStudent(Student student);

	Student getStudentById(Long id);

	List<Student> findAllStudents();

	void updateUser(Student currentStudent);

	public void deleteStudent(long id);

}
