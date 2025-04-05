package com.example.demo.Teacher.repo.impl;

import com.example.demo.Teacher.entity.Teacher;
import com.example.demo.Teacher.repo.ITeacherCustomRepo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


public class TeacherCustomRepoImpl implements ITeacherCustomRepo {

    private final JdbcTemplate jdbcTemplate;

    public TeacherCustomRepoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Teacher> aa(String subject) {
        String sql = "SELECT * FROM teachers WHERE subject = ?";
        return jdbcTemplate.query(sql, new Object[]{subject}, new BeanPropertyRowMapper<>(Teacher.class));
    }
}
