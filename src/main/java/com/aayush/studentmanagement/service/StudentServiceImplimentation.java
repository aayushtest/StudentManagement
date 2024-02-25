package com.aayush.studentmanagement.service;

import com.aayush.studentmanagement.dto.StudentDTO;
import com.aayush.studentmanagement.model.Student;
import com.aayush.studentmanagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImplimentation implements StudentService{

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<Student> getAllStudents() {
        // first lets get all the students in a list from database
        List<Student> students = studentRepo.findAll();

        // now lets create a new list of students to store from database
        List<StudentDTO> studentDTOS = new ArrayList<>();

        for(Student student: students){
            StudentDTO tempStudentDTO = new StudentDTO();
            tempStudentDTO.setId(student.getId());

        }

    }
}
