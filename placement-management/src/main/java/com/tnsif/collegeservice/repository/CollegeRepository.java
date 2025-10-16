package com.tnsif.collegeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnsif.collegeservice.entity.College;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
