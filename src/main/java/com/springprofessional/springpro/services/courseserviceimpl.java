package com.springprofessional.springpro.services;

import com.springprofessional.springpro.entities.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface courseserviceimpl {

    public List<Course>getcourses();
    public Optional<Course> getcourse(int courseid);
    public Course Addcourse(Course course);
    public Course Updatecourse(Course course);
    public void Deletecourse(long parselong);
}
