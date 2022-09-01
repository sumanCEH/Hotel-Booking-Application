package com.capgemini.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.BookingDetails;
import com.capgemini.entity.repository.BookingDetailsRepository;

@Service
public class BookingDetailsServiceImpl implements BookingDetailsService {
	
	@Autowired
	private BookingDetailsRepository bookingDetailsRepository;

	@Override
	public BookingDetails addBookingDetails(BookingDetails bookingDetails) {
		return bookingDetailsRepository.save(bookingDetails);
	}

}
