package com.springbootdev.examples.mapping.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String country;

    private String email;

    @Column(name = "created_at")
    private String createdAt;

    @OneToMany(mappedBy = "student")
    private List<StudentCourseEnrollment> studentCourseEnrollments;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentCourseEnrollment> getStudentCourseEnrollments() {
        return studentCourseEnrollments;
    }

    public void setStudentCourseEnrollments(List<StudentCourseEnrollment> studentCourseEnrollments) {
        this.studentCourseEnrollments = studentCourseEnrollments;
    }
}
