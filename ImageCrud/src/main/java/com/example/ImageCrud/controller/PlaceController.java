package com.example.ImageCrud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ImageCrud.exception.ResourceNotFoundException;
import com.example.ImageCrud.model.Place;
import com.example.ImageCrud.repository.ImageCrudRepository;
 
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class PlaceController {
	
	@Autowired
	private ImageCrudRepository imageCrudRepository;
	
	// get all place
	@GetMapping("/place")
	public List<Place> getAllPlaces(){
		return imageCrudRepository.findAll();
	}
	
	//create place rest api
	@PostMapping("/place/create")
	public Place createPlace(@RequestBody Place place) {
    return imageCrudRepository.save(place);
	}
	
    //get place by id rest api
    @GetMapping("/Place/{id}")
    public ResponseEntity<Place>getPlaceById(@PathVariable long id) {
    	Place place =imageCrudRepository.findById(id)
    			.orElseThrow(()-> new ResourceNotFoundException("Place not Exist with Id :" + id));
    	return ResponseEntity.ok(place);
    }
    
    //update place rest api
    @PutMapping("/place/{id}")
    public ResponseEntity<Place> updatePlace(@PathVariable Long id, @RequestBody Place placeDetails){
    	Place place =imageCrudRepository.findById(id)
    			.orElseThrow(()-> new ResourceNotFoundException("Place not Exist with Id :" + id));
    	place.setPlaceName(placeDetails.getPlaceName());
    	place.setDescription(placeDetails.getDescription());
    	place.setImage(placeDetails.getImage());
    	
    	Place updatedPlace =imageCrudRepository.save(place);
    	return ResponseEntity.ok(updatedPlace);
    
    }
    
    //Delete Place rest api
    @DeleteMapping("/place/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePlace(@PathVariable Long id){
    	Place place =imageCrudRepository.findById(id)
    			.orElseThrow(()-> new ResourceNotFoundException("Place not Exist with Id :" + id));
    	
    	imageCrudRepository.delete(place);
    	Map<String, Boolean> response = new HashMap<>();
    	response.put("deleted", Boolean.TRUE);
    	return ResponseEntity.ok(response);
    	
    }
}
    