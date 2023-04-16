package com.kaminocode.demo.rest;

import com.kaminocode.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    // define endpoint for /students - return a list of students

    @GetMapping("/students")
    public List<Student> getStudents() {

        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Cassian", "Andor"));
        theStudents.add(new Student("Galen", "Erso"));
        theStudents.add(new Student("Luthen", "Rael"));
        theStudents.add(new Student("Vel", "Sartha"));

        return theStudents;
    }
}
