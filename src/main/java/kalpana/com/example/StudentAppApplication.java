package kalpana.com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
		System.out.println("hello from app");
	}
	
	@GetMapping("/")
	public ResponseEntity getWelcomeMsg() {
		return new ResponseEntity("welcome", HttpStatus.OK);
	}
}
