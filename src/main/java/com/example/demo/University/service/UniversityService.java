package com.example.demo.University.service;

import com.example.demo.Student.entity.Student;
import com.example.demo.Student.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {

    @Autowired
    private StudentRepository studentRepository;

    public Page<Student> getStudentsByUniversityId(Long universityId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return studentRepository.findByUniversityId(universityId, pageable);
    }
}
