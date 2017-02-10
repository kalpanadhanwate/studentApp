package kalpana.com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kalpana.com.example.model.Student;
import kalpana.com.example.services.StudentService;

@RestController
public class StudentRestController {

	@Autowired
	private StudentService studentService;

	//
	@GetMapping("/rest/student/{id}")
	public ResponseEntity getStudent(@PathVariable("id") Long id) {

		Student stud = studentService.getStudentById(id);
		if (stud == null) {
			return new ResponseEntity("No Customer found for ID " + id, HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity(stud, HttpStatus.OK);
	}

	//
	@PostMapping(value = "/rest/student")
	public ResponseEntity createStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
		return new ResponseEntity(student, HttpStatus.CREATED);
	}

	//
	@DeleteMapping("/rest/studentDelete/{id}")
	public ResponseEntity deleteStudent(@PathVariable Long id) {
		if (studentService.getStudentById(id) == null) {
			return new ResponseEntity("No Student found for ID " + id, HttpStatus.NOT_FOUND);
		} else {
			studentService.deleteStudent(id);
			return new ResponseEntity(id, HttpStatus.OK);
		}
	}
	

}
