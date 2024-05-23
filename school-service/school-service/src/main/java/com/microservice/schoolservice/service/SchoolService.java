package com.microservice.schoolservice.service;

import com.microservice.schoolservice.model.School;
import com.microservice.schoolservice.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository schoolRepository;

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public School fetchSchoolById(int id){
        return schoolRepository.findById(id).orElse(null);
    }

    public School addSchool(School school) {

        return schoolRepository.save(school);
    }
}
