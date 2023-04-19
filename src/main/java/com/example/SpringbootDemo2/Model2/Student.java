package com.example.SpringbootDemo2.Model2;

import com.example.SpringbootDemo2.repository.StudentRepo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student  {

    @Id
    int stuId;
    String stuFirstName;
    String stuLastName;
    int stuAge;
    String stuCourse;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuFirstName() {
        return stuFirstName;
    }

    public void setStuFirstName(String stuFirstName) {
        this.stuFirstName = stuFirstName;
    }

    public String getStuLastName() {
        return stuLastName;
    }

    public void setStuLastName(String stuLastName) {
        this.stuLastName = stuLastName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getStuCourse() {
        return stuCourse;
    }

    public void setStuCourse(String stuCourse) {
        this.stuCourse = stuCourse;
    }




}
