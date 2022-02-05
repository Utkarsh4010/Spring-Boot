package edu.institute.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="empinfo")   // to give a table name
public class Employees {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)  // to give auto generated id
   private int id;
   
   @Column(name="empname", length=20, nullable=false)  // to change column name, apply length, and value not be empty
   private String name;
   
   @Column(nullable=false,unique=true) // the value not be empty and the value is unique
   private String email;
   
   @Temporal(TemporalType.DATE)  // to get a date
   private Date doj;
   
   @CreationTimestamp  // to get a time at the creation time
  // @UpdateTimestamp    // to get a updated time
   private Date createdts;
   
   
   private double salary;
   
   @Transient   //didnt created table for this variable
   private int age;
   
   
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}
public Date getCreatedts() {
	return createdts;
}
public void setCreatedts(Date createdts) {
	this.createdts = createdts;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
   
   
   
}
