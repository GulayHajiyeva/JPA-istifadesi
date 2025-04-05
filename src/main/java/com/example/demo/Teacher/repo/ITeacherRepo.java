package com.example.demo.Teacher.repo;

import com.example.demo.Teacher.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepo extends  ITeacherCustomRepo,JpaRepository<Teacher, Long>{
}
