package com.asadullah.TestApiv2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asadullah.TestApiv2.model.Student;
import com.asadullah.TestApiv2.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/V2/")
public class StudentController {


  private final StudentService serveicService = new StudentService();

  @GetMapping
  public List<Student> getAll() {
      return serveicService.getStudentList();
  }

  @GetMapping("/course/{name}")
  public List<Student> getByCourse(@PathVariable String name){
    return StudentService.getStudentsByCourse(name);
  }

}
