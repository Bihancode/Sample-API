package com.example.demo.service.impl;

import com.example.demo.controler.student;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired




    @Override
    public List<student> getStudentBycity(String Name) {
        List<student> studentList = new ArrayList<>();
        studentList.add(new Student("CS/2018/021", "kavinda", "piliyanda"));
        studentList.add(new Student("CS/2018/002", "kasun", "Galle"));
        studentList.add(new Student("CS/2018/015", "nipun", "Colombo"));
        studentList.add(new Student("CS/2018/018", "gayan", "matara"));
        studentList.add(new Student("CS/2018/032", "rusiru", "dehiwala"));
        
        return studentList.stream().filter(student -> student.getName() == Name).collect(Collectors.toList());
    }

    @Override
    public List<student> getStudentByName(String Name) {
        return null;
    }

    @Override
    public List<student> getAllStudents() {


        return studentRepository.findAll;
    }

    @Override
    public List<Student> getStudentByCity(String city){
        return null;
    }
}
