package com.institute.bean;

public class Student {
    private String name;
    public Student(String name) {
    	this.name=name;
    	System.out.println("Student Created " + name);
    	
    }
    public String getName() {
    	return name;
    }
}
