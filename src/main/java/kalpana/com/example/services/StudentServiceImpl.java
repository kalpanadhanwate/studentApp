package kalpana.com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kalpana.com.example.model.Student;
import kalpana.com.example.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findOne(id);
	}

	@Override
	public List<Student> findAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public void updateUser(Student currentStudent) {
		studentRepository.save(currentStudent);
	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.delete(id);
	}

}
