package com.juanfedevmaster.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer idStudent;

    @Column(name="name", length = 100)
    private String fullName;

    @Column(name="lastname", length = 100)
    private String lastName;

    @Column(name="phonenumber")
    private Long phoneNumber;

    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER)
    private List<Course> courses = new ArrayList<>();

    public Student(String fullName, String lastName, Long phoneNumber) {
        this.fullName = fullName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

}
