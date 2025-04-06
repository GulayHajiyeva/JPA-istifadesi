package com.example.demo.security;

import com.example.demo.Student.entity.Student;
import com.example.demo.Student.repo.StudentRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

private final StudentRepository studentRepository;


    public CustomUserDetailsService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Student student = studentRepository.findByUsername(username);
        if (student == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }

        // Spring Security üçün UserDetails qaytarırıq
        return org.springframework.security.core.userdetails.User
                .withUsername(student.getUsername())
                .password(student.getPassword())
                .build();
    }
    }

