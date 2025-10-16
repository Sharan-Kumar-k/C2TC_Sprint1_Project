package com.tnsif.collegeservice.service;

import java.util.List;

import com.tnsif.collegeservice.entity.College;

public interface CollegeService {

    List<College> getAllColleges();
    College getCollegeById(Long id);
    College createCollege(College college);
    College updateCollege(Long id, College college);
    void deleteCollege(Long id);
}
