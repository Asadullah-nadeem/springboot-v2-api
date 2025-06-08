package com.asadullah.TestApiv2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.asadullah.TestApiv2.model.Student;

public class StudentService{

  private final static List<Student> StudentList = new ArrayList<>(List.of(
    new Student(1, "Asadullah",20, "Java","I love Java"),
    new Student(2, "Nadeem",20 ,"spring framework", "I love spring framework"),
    new Student(3, "Muhammad", 20,"Spring Boot", "I love Spring Boot")
  ));


    public List<Student> getStudentList() {
        return StudentList;
    }


public static  List<Student> getStudentsByCourse(String course) {
        return StudentList.stream()
                       .filter(
                        s -> s
                       .getCourse()
                       .equalsIgnoreCase(course))
                       .collect(Collectors
                       .toList());
    }
}
