package com.springbootcrudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcrudapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	
}
