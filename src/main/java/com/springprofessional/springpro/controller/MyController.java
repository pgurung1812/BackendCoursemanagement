package com.springprofessional.springpro.controller;

import com.springprofessional.springpro.entities.Course;
import com.springprofessional.springpro.services.courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    private courseservice Courservice;
    @GetMapping("/courses")
    public List<Course>Getcourses()
    {
       return this.Courservice.getcourses();
    }
    @GetMapping("/courses/{courseid}")
    public Optional<Course> Getcourse(@PathVariable int courseid)
    {
        return this.Courservice.getcourse(courseid);
    }

    @PostMapping("/courses")
    public Course Addcourse(@RequestBody Course course)
    {
        return this.Courservice.Addcourse(course);
    }
    @PutMapping("/courses")
    public Course Updatecourse(@RequestBody Course course)
    {
        return this.Courservice.Updatecourse(course);
    }
    @DeleteMapping("/courses/{courseid}")
    public ResponseEntity<HttpStatus> Deletecourse(@PathVariable long courseid)
    {
        try {
            this.Courservice.Deletecourse(courseid);
            return new ResponseEntity<>(HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
