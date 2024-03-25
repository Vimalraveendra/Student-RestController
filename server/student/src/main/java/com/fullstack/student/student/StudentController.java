package com.fullstack.student.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentServiceImp studentServiceImp;
    @Autowired
    public StudentController(StudentServiceImp studentServiceImp){
        this.studentServiceImp=studentServiceImp;
    }
    @GetMapping
    public List<Student> getStudents(){
        return  studentServiceImp.getStudents();
    }

}
