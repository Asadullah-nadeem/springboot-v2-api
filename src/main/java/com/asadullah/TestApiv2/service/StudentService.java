package com.asadullah.TestApiv2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.asadullah.TestApiv2.model.Student;

public class StudentService{

  private final static List<Student> StudentList = new ArrayList<>(List.of(
    new Student(1, "Asadullah", "Java"),
    new Student(2, "Nadeem", "spring framework"),
    new Student(3, "Muhammad", "Spring Boot")
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
