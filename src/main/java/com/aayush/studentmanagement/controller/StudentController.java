package com.aayush.studentmanagement.controller;

import com.aayush.studentmanagement.model.Student;
import com.aayush.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    private StudentService studentService;

    // first lets get all the students in the database
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        Student allStudents = studentService.
    }

}
