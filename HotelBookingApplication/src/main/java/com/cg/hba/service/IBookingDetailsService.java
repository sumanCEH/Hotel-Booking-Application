package com.cg.hba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hba.entity.BookingDetails;

@Service
public interface IBookingDetailsService {

	BookingDetails addBookingDetails(BookingDetails bookingdetails);
	BookingDetails updateBookingDetails(BookingDetails bookingdetails);
	BookingDetails removeBookingDetails(BookingDetails bookingdetails);
	List<BookingDetails> showAllBookingDetails(BookingDetails bookingdetails);
	BookingDetails showBookingDetails(BookingDetails bookingdetails);
}
