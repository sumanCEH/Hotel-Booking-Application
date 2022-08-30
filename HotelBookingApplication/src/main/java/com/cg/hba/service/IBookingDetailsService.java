package com.cg.hba.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.hba.entity.BookingDetails;

@Service
public interface IBookingDetailsService {

	BookingDetails addBookingDetails(BookingDetails bookingdetails);
	BookingDetails updateBookingDetails(BookingDetails bookingdetails);
<<<<<<< Updated upstream
	BookingDetails removeBookingDetails(BookingDetails bookingdetails);
	List<BookingDetails> showAllBookingDetails(BookingDetails bookingdetails);
	BookingDetails showBookingDetails(BookingDetails bookingdetails);
}
=======
	BookingDetails removeBookingDetails(int booking_id);
	List<BookingDetails> showAllBookingDetails();
	BookingDetails showBookingDetails(int booking_id);
}
>>>>>>> Stashed changes
