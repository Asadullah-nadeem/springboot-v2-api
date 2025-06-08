package com.asadullah.TestApiv2.model;

public class Student {

  private int id;
  private int age;
  private String name;
  private String course;
  private String description;

  public Student(int id, String name,int age, String course, String description)
  {
    this.id = id;
    this.age = age;
    this.name = name;
    this.course = course;
    this.description = description;
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

  public String getdescription()
  {
    return description;
  }

}
