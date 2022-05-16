package com.example.ImageCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ImageCrud.model.Place;
 

public interface ImageCrudRepository extends JpaRepository<Place, Long> {

}
