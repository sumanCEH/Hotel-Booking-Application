package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.hotels;
import com.capgemini.entity.service.hotelservice;



@RestController
public class HotelController {
	@Autowired
	private hotelservice hs;
	
	
	//add hotel
	@GetMapping("/hotels")
	public List<hotels> getHotels(){
		
		return ((hotelservice) this.hs).getHotels();
	}
	 
	
	//hotel by id
	@GetMapping("/hotels/{id}")
	public hotels gethotel(@PathVariable String id)
	{
		return this.hs.gethotel(Integer.parseInt(id));
	}

	
	@PostMapping("/addhotels")
	public hotels addhotel(@RequestBody hotels htl)
	{
		return this.hs.addhotel(htl);
	}
	
	
	@PutMapping("/updatehotels")
	public hotels updatehotel(@RequestBody hotels ht) {
		return this.hs.updatehotel(ht);
		
	}
	
	@DeleteMapping("/hotels/{id}")
	public ResponseEntity<HttpStatus> deletehotel(@PathVariable String id)
	{
		try {
			this.hs.deletehotel(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
