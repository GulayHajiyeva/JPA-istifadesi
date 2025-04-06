package com.example.demo.Teacher.repo;


import com.example.demo.Teacher.entity.Teacher;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ITeacherCustomRepo {

        List<Teacher> aa(String subject);
}

