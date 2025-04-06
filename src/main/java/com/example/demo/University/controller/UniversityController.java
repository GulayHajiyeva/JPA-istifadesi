package com.example.demo.University.controller;

import com.example.demo.Student.entity.Student;
import com.example.demo.University.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {

    @Autowired
    private UniversityService universityService;

    @GetMapping("/university/{id}/students")
    public Page<Student> getStudents(@PathVariable Long id,
                                     @RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "3") int size) {
        return universityService.getStudentsByUniversityId(id, page, size);
    }
}
