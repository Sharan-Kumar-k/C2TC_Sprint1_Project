package com.tnsif.collegeservice.service;

import org.springframework.stereotype.Service;

import com.tnsif.collegeservice.entity.College;
import com.tnsif.collegeservice.repository.CollegeRepository;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {

    private final CollegeRepository repo;

    public CollegeServiceImpl(CollegeRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<College> getAllColleges() {
        return repo.findAll();
    }

    @Override
    public College getCollegeById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("College not found with id: " + id));
    }

    @Override
    public College createCollege(College college) {
        return repo.save(college);
    }

    @Override
    public College updateCollege(Long id, College college) {
        College existing = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("College not found with id: " + id));
        existing.setCollegeName(college.getCollegeName());
        existing.setLocation(college.getLocation());
        existing.setEmail(college.getEmail());
        existing.setPhone(college.getPhone());
        existing.setAffiliation(college.getAffiliation());        // new
        existing.setEstablishedYear(college.getEstablishedYear()); // new
        return repo.save(existing);
    }


    @Override
    public void deleteCollege(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("College not found with id: " + id);
        }
        repo.deleteById(id);
    }
}
