package com.cg.hba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hba.entity.BookingDetails;
import com.cg.hba.exceptions.BookingDetailsNotFoundException;

@Service
public interface IBookingDetailsService {

	public BookingDetails addBookingDetails(BookingDetails bookingdetails);
	public BookingDetails updateBookingDetails(BookingDetails bookingdetails) throws BookingDetailsNotFoundException;
	public String removeBookingDetails(int booking_id) throws BookingDetailsNotFoundException;
	public List<BookingDetails> showAllBookingDetails() throws BookingDetailsNotFoundException;
	public BookingDetails showBookingDetails(int booking_id) throws BookingDetailsNotFoundException;
}