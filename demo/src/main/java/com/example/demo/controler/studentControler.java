package com.example.demo.controler;


import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class studentControler {

    @Autowired
    private StudentService studentService;


    @GetMapping("/student-details")
    public ResponseEntity<List<Student>> studentDetails(@RequestParam String Name){

        List<student> studentList = studentService.getStudentByName(Name);

        if(studentList.isEmpty()){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(studentList,HttpStatus.OK);
    }

    @RequestMapping("/Student-list",)
    public ResponseEntity<List<Student>> studentList(){
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
