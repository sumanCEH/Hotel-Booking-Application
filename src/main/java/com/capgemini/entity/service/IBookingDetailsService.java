package com.capgemini.entity.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.entity.BookingDetails;
import com.capgemini.exception.BookingDetailsNotFoundException;

@Service
public interface IBookingDetailsService {

	public BookingDetails addBookingDetails(BookingDetails bookingdetails);
	public BookingDetails updateBookingDetails(BookingDetails bookingdetails) throws BookingDetailsNotFoundException;
	public String removeBookingDetails(int booking_id) throws BookingDetailsNotFoundException;
	public List<BookingDetails> showAllBookingDetails() throws BookingDetailsNotFoundException;
	public BookingDetails showBookingDetails(int booking_id) throws BookingDetailsNotFoundException;
}