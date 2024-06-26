package com.fullstack.student.service;

import com.fullstack.student.entity.Student;
import com.fullstack.student.repository.StudentRepository;
import com.fullstack.student.service.StudentService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentServiceImp implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository){
       this.studentRepository=studentRepository;
    }
    @Override
    public List<Student>getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Jose",
                        23,
                        "jose@gmail.com",
                        LocalDate.of(2000, 05, 10)
                ),
                new Student(
                        2L,
                        "Maria",
                        34,
                        "maria@gmail.com",
                        LocalDate.of(2004, 03, 15)
                )
        );
        studentRepository.saveAll()
    }
 repo

}
