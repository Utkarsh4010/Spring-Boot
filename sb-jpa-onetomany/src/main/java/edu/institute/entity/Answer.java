package edu.institute.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	private String answer;
	@CreationTimestamp     // it gives created time
	private Date postedts;
	@ManyToOne
	private Question qid;
	public int getId() {
		return aid;
	}
	public void setId(int id) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Date getPostedts() {
		return postedts;
	}
	public void setPostedts(Date postedts) {
		this.postedts = postedts;
	}
	public Question getQid() {
		return qid;
	}
	public void setQid(Question qid) {
		this.qid = qid;
	}
	

}
