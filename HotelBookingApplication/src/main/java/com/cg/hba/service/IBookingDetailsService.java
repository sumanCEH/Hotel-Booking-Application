package com.cg.hba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hba.entity.BookingDetails;
import com.cg.hba.exceptions.BookingDetailsNotFoundException;

@Service
public interface IBookingDetailsService {

	BookingDetails addBookingDetails(BookingDetails bookingdetails);
	BookingDetails updateBookingDetails(BookingDetails bookingdetails) throws BookingDetailsNotFoundException;
	String removeBookingDetails(int booking_id) throws BookingDetailsNotFoundException;
	List<BookingDetails> showAllBookingDetails() throws BookingDetailsNotFoundException;
	BookingDetails showBookingDetails(int booking_id) throws BookingDetailsNotFoundException;
}