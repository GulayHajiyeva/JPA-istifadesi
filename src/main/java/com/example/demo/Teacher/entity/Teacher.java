package com.example.demo.Teacher.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "teachers")
public class Teacher  {
    @Id
    private Integer id;
    private String name;
    private String surname;
    private String subject;
    private double salary;

    public Integer getId() {
        return id;
    }

    public Teacher setId(Integer id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }

    public Teacher setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Teacher setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getSubject() {
        return subject;
    }

    public Teacher setSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Teacher setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public String toString() {
        return  name + " " + surname +" "+ subject + " "+ salary;
    }

}
