package com.juanfedevmaster.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;

@Entity 
@Table(name="students")
public class Student {
    @Id 
    @Column(name = "id")
    private Integer idStudent;

    @Column(name="name", length = 100)
    private String fullName;

    @Column(name="lastname", length = 100)
    private String lastName;

    @Column(name="phonenumber")
    private Long phoneNumber;

    @ManyToAny
    @JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn (name = "course_id")
    )
    private List<Course> courses = new ArrayList<>();

    public Student(){
        
    }

    public Student(Integer idStudent, String fullName, String lastName, Long phoneNumber, List<Course> courses) {
        this.idStudent = idStudent;
        this.fullName = fullName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.courses = courses;
    }

    public Integer getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Integer idStudent) {
        this.idStudent = idStudent;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    
}
