package com.microservice.schoolservice.controller;

import com.microservice.schoolservice.model.School;
import com.microservice.schoolservice.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    SchoolService schoolService;

    @GetMapping
    public List<School> getAllSchools() {
        return schoolService.getAllSchools();
    }

    @GetMapping("/{id}")
    public School fetchSchoolById(@PathVariable int id){
        System.out.println("ID received: " + id);
        return schoolService.fetchSchoolById(id);
    }


    @PostMapping
    public School addSchool(@RequestBody School school) {

        return schoolService.addSchool(school);
    }

}
