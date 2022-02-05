package edu.institute.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="stud_edu")
public class StudentEducation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String institute;
	private String year;
	private double percent;
	private String eduTitle;
	@ManyToOne(fetch=FetchType.LAZY)
	private StudentInfo sid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	public String getEduTitle() {
		return eduTitle;
	}
	public void setEduTitle(String eduTitle) {
		this.eduTitle = eduTitle;
	}
	public StudentInfo getSid() {
		return sid;
	}
	public void setSid(StudentInfo sid) {
		this.sid = sid;
	}
	
	

}
