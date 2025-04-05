package com.example.demo.Teacher.repo;


import com.example.demo.Teacher.entity.Teacher;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface ITeacherCustomRepo {

        @Modifying
        List<Teacher> aa(String subject);
}

