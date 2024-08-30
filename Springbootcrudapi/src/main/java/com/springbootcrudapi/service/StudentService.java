package com.springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcrudapi.entity.Student;
import com.springbootcrudapi.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Student student = getStudentById(id);
        if (student != null) {
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            return studentRepository.save(student);
        }
        return null;
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
