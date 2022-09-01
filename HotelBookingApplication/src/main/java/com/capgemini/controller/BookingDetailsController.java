package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.BookingDetails;
import com.capgemini.entity.service.BookingDetailsService;

@RestController
public class BookingDetailsController {
	
	@Autowired
	private BookingDetailsService bookingDetailsService;
	
	@PostMapping("/add/bookingDetails")
	private BookingDetails addBookingDetails(@RequestBody BookingDetails bookingDetails) {
		
		return bookingDetailsService.addBookingDetails(bookingDetails);
		
	}
	
	

}
