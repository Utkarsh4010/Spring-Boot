package com.institute.bean;

public class Student {
      private int id;
      private String name;
      private Address address;  //Dependency
      private EducationalDetails higherEdu;  //Dependency 
      public Student() {
    	  
      }
      public Student(int id, String name, Address address, EducationalDetails higherEdu) {
    	  super();
    	  this.id=id;
    	  this.name=name;
    	  this.address =address;
    	  this.higherEdu=higherEdu;
    	  
      }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public EducationalDetails getHigherEdu() {
		return higherEdu;
	}
	public void setHigherEdu(EducationalDetails higherEdu) {
		this.higherEdu = higherEdu;
	}
      
}
