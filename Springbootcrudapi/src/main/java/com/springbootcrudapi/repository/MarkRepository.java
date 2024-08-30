package com.springbootcrudapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcrudapi.entity.Mark;

public interface MarkRepository extends JpaRepository<Mark, Long> {
    List<Mark> findByStudentId(Long studentId);
}
