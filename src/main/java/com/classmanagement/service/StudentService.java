package com.classmanagement.service;

import com.classmanagement.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Optional<Student> getStudentByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(Long id);
}
