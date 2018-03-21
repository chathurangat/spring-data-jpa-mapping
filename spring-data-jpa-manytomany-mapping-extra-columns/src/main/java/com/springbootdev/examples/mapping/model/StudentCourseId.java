package com.springbootdev.examples.mapping.model;

import java.io.Serializable;

public class StudentCourseId implements Serializable
{
    private Long course;
    private Long student;

    public Long getCourse() {
        return course;
    }

    public void setCourse(Long course) {
        this.course = course;
    }

    public Long getStudent() {
        return student;
    }

    public void setStudent(Long student) {
        this.student = student;
    }
}
