package com.springbootcrudapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcrudapi.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
