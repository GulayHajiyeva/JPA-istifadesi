package com.example.demo;


import com.example.demo.Teacher.entity.Teacher;
import com.example.demo.Teacher.repo.ITeacherCustomRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teacherslerr")
public class TeacherController {

    private final ITeacherCustomRepo repo;

    public TeacherController(ITeacherCustomRepo repo) {
        this.repo = repo;
    }


//    @GetMapping
//    public List<Teacher> getList() {
//        return repo.findAll();
//    }


    @GetMapping("/subject/Java")
    public List<Teacher> getTeachersBySubject() {
        return repo.aa("Java");
    }
}
