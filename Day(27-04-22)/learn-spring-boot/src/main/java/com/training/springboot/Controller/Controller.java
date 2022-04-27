package com.training.springboot.Controller;

import com.training.springboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1, "Learn Microservices", "Training"));
    }
}
