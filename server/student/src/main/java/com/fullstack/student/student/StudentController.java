package com.fullstack.student.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Jose",
                        23,
                        "jose@gmail.com",
                        LocalDate.of(2000,05,10)
                ),
        new Student(
                2L,
                "Maria",
                34,
                "maria@gmail.com",
                LocalDate.of(2004,03,15)
        )
        );
    }
}
