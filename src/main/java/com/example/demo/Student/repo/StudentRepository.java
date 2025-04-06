package com.example.demo.Student.repo;

import com.example.demo.Student.entity.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    Student findByUsername(String username);
    Page<Student> findByUniversityId(Long universityId, Pageable pageable);
}
