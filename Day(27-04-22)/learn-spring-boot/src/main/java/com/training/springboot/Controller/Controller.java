package com.training.springboot.Controller;

import com.training.springboot.courses.bean.Course;
import com.training.springboot.repository.CourseRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
//        return Arrays.asList(new Course(1, "Learn Microservices 3", "Training"));
       return repository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable Long id){
        Optional<Course> course = repository.findById(id);

        if(course.isEmpty()){
            throw new RuntimeException("Course not found with id " + id);
        }

        return course.get();
    }

    @PostMapping("/courses")
    public void creatCourse(@RequestBody Course course){
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable Long id, @RequestBody Course course){
        repository.save(course);
    }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable Long id){
        repository.deleteById(id);
    }
}
