package kalpana.com.example.repository;

import org.springframework.data.repository.CrudRepository;

import kalpana.com.example.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
