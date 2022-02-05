package com.institute;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {
     private int id;
     private String name;
     private double price;
     private List<String> comment;
     private Map<Double, Integer> ratings;
     private Set<String> model;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<String> getComment() {
		return comment;
	}
	public void setComment(List<String> comment) {
		this.comment = comment;
	}
	public Map<Double, Integer> getRatings() {
		return ratings;
	}
	public void setRatings(Map<Double, Integer> ratings) {
		this.ratings = ratings;
	}
	public Set<String> getModel() {
		return model;
	}
	public void setModel(Set<String> model) {
		this.model = model;
	}
     
}
