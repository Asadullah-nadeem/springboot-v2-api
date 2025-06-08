package com.asadullah.TestApiv2.model;

public class Student {

  private int id;
  private int age;
  private String name;
  private String course;

  public Student(int id, String name,int age, String course)
  {
    this.id = id;
    this.age = age;
    this.name = name;
    this.course = course;
  }

  public int getID()
  {
    return id;
  }

  public int getAge()
  {
    return age;
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
