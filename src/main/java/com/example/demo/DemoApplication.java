package com.example.demo;

import com.example.demo.Student.entity.Student;
import com.example.demo.Student.repo.StudentRepository;
import com.example.demo.University.entity.University;
import com.example.demo.University.repo.UniversityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(UniversityRepository universityRepository,
								 StudentRepository studentRepository) {
		return args -> {

			// Əvvəlcə universitetləri əlavə et (əgər boşdursa)
			if (universityRepository.count() == 0) {
				universityRepository.save(new University(null, "Oxford", null));
				universityRepository.save(new University(null, "Harvard", null));
			}

			// Universitetləri bazadan götür
			University oxford = universityRepository.findById(1L).orElse(null);
			University harvard = universityRepository.findById(2L).orElse(null);

			// Tələbələri əlavə et
			if (studentRepository.count() == 1 && oxford != null && harvard != null) {
				Student s1 = new Student();
				s1.setUsername("ali123");
				s1.setPassword("pass1");
				s1.setUniversity(oxford);

				Student s2 = new Student();
				s2.setUsername("ayse456");
				s2.setPassword("pass2");
				s2.setUniversity(harvard);

				Student s3 = new Student();
				s3.setUsername("veli789");
				s3.setPassword("pass3");
				s3.setUniversity(oxford);

				studentRepository.save(s1);
				studentRepository.save(s2);
				studentRepository.save(s3);

				System.out.println("Tələbələr uğurla əlavə olundu.");
			}
		};
	}
}
