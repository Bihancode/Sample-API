package com.example.demo.model;

import com.example.demo.controler.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student extends student {

    @Id
    @GeneratedValue
    private long id;
    private String studentNumber;
    private String Name;
    private String city;


    public Student() {
    }

    public Student(String studentNumber, String studentName, String city) {
        this.studentNumber = studentNumber;
        this.Name = studentName;
        this.city = city;
    }

    public void setId(Long id){
        this.id = id;
    }


    public Long getId(){
        return id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return Name;
    }

    public void setStudentName(String studentName) {
        this.Name = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
