package com.juanfedevmaster.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;

@Entity
@Table(name="course")
public class Course {
    @Id 
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer credits;

    @ManyToAny
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "course_id"),
        inverseJoinColumns = @JoinColumn (name = "student_id")
    )
    private List<Student> students = new ArrayList<>();
}
