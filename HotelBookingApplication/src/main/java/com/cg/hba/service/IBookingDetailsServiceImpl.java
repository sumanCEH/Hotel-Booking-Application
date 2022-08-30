package com.cg.hba.service;

<<<<<<< Updated upstream
import java.util.List;
=======
import java.util.List; 
>>>>>>> Stashed changes

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hba.entity.BookingDetails;
import com.cg.hba.repositoy.IBookingDetailsRepository;

@Service
@Transactional
public class IBookingDetailsServiceImpl implements IBookingDetailsService{

	@Autowired
	IBookingDetailsRepository repo;
	
	@Override
	public BookingDetails addBookingDetails(BookingDetails bookingdetails) {
		repo.save(bookingdetails);
		return bookingdetails;
	}

	@Override
	public BookingDetails updateBookingDetails(BookingDetails bookingdetails) {
		BookingDetails bd = repo.getById(bookingdetails.getBooking_id());
		bd.setBooked_from(bookingdetails.getBooked_from());
		bd.setBooked_to(bookingdetails.getBooked_to());
		bd.setNo_of_adults(bookingdetails.getNo_of_adults());
		bd.setNo_of_children(bookingdetails.getNo_of_children());
		return bd;
	}

	@Override
<<<<<<< Updated upstream
	public BookingDetails removeBookingDetails(BookingDetails bookingdetails) {
		 repo.deleteById(bookingdetails.getBooking_id());
		return bookingdetails;
	}

	@Override
	public List<BookingDetails> showAllBookingDetails(BookingDetails bookingdetails) {
		return repo.findAll();
	}

	@Override
	public BookingDetails showBookingDetails(BookingDetails bookingdetails) {
		return repo.getById(bookingdetails.getBooking_id());
	}

}
=======
	public BookingDetails removeBookingDetails(int booking_id) {
		 BookingDetails bd= repo.getById(booking_id);
		 repo.deleteById(booking_id);
		 return bd;
	}

	@Override
	public List<BookingDetails> showAllBookingDetails() {
		List<BookingDetails> list=repo.findAll();
	    return list;
	}

	@Override
	public BookingDetails showBookingDetails(int booking_id) {
		BookingDetails bd= repo.getById(booking_id);
		return bd;
	}

}
>>>>>>> Stashed changes
