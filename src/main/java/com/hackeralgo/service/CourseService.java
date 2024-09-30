package com.hackeralgo.service;

import com.hackeralgo.entity.Course;
import com.hackeralgo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourseById(String courseId) {
        return courseRepository.findById(courseId);
    }
}
