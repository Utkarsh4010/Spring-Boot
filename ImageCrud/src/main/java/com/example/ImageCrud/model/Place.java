package com.example.ImageCrud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="places")
public class Place {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
     private long id;
	
	@Column(name="place_name")
     private String placeName;
	
	@Column(name="description")
     private String description ;
	
	@Column(name="image")
     private String image;
     
     public Place() {
    	 
     }
     
     public Place(String placeName, String description, String image) {
    	 super();
 		this.placeName = placeName;
 		this.description = description;
 		this.image= image;
     }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
     
     
     
     
     
     
     
     
     