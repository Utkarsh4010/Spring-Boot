package edu.institute.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Question {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int qid;
  private String title;
  private String description;
  @CreationTimestamp
  private Date postedts;
  //mappedBy:is use to mapped with foreign key created inside another table. mostly use for bi-direction
  //cascade: this property is use to perform the deletion or updation operations on the related tables
  @OneToMany(mappedBy="qid", cascade=CascadeType.ALL,fetch=FetchType.EAGER)
  private List<Answer>answers;
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Date getPostedts() {
	return postedts;
}
public void setPostedts(Date postedts) {
	this.postedts = postedts;
}
public List<Answer> getAnswers() {
	return answers;
}
public void setAnswers(List<Answer> answers) {
	this.answers = answers;
}
  
}
