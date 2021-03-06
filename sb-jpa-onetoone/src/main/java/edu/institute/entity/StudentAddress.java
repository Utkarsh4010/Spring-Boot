package edu.institute.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="stud_add")
public class StudentAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String city;
	private String pin;
	private String state;
	@OneToOne(fetch=FetchType.LAZY)
	private StudentInfo sid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public StudentInfo getSid() {
		return sid;
	}
	public void setSid(StudentInfo sid) {
		this.sid = sid;
	}
	
	
	

}
