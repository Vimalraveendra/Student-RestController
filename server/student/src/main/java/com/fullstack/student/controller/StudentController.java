package com.fullstack.student.controller;

import com.fullstack.student.entity.Student;
import com.fullstack.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService=studentService;
    }
    @GetMapping
    public List<Student> getStudents(){
        return  studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student){
        studentService.addNewStudent(student);
    }

}
