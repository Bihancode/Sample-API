package com.example.demo.service;

import com.example.demo.controler.student;
import com.example.demo.model.Student;

import java.util.List;

public interface StudentService {

    List<student> getStudentByName(String Name );
    List<student> getAllStudents( );


    List<Student> getStudentByCity(String city);
}
