package edu.institute.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity  // use to define class as a entity class
public class Empployee {
	@Id  //use to define the primary key column in table
	private int id;
	private String name;
	private String contact;
	private String email;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
