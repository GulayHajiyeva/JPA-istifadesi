package com.example.demo.Teacher.repo;

import com.example.demo.Teacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITeacherRepo extends JpaRepository<Teacher, Long>{

}
//findById(Long id)
//
//findAll()
//
//save(Teacher teacher)
//
//deleteById(Long id) və s.
