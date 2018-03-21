package com.springbootdev.examples.mapping.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "student_courses")
@IdClass(StudentCourseId.class)
public class StudentCourseEnrollment implements Serializable
{
    @Id
    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

    @Id
    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @JoinColumn(name = "from_date")
    private String fromDate;

    @JoinColumn(name = "to_date")
    private String toDate;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }
}
