package com.asadullah.TestApiv2.model;

public class Student {

  private int id;
  private String name;
  private String course;

  public Student(int id, String name, String course)
  {
    this.id = id;
    this.name = name;
    this.course = course;
  }

  public int getID()
  {
    return id;
  }

  public String getName()
  {
    return name;
  }

  public String getCourse()
  {
    return course;
  }

}
