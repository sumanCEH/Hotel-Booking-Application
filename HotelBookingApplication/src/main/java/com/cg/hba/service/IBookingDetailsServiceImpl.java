package com.cg.hba.service;

import java.util.List; 

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hba.entity.BookingDetails;
import com.cg.hba.exceptions.BookingDetailsNotFoundException;
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
	public BookingDetails updateBookingDetails(BookingDetails bookingdetails) throws BookingDetailsNotFoundException {
		if(repo.findById(bookingdetails.getBooking_id()).isPresent()) {
		    BookingDetails bd = repo.getById(bookingdetails.getBooking_id());
		    bd.setBooked_from(bookingdetails.getBooked_from());
		    bd.setBooked_to(bookingdetails.getBooked_to());
		    bd.setNo_of_adults(bookingdetails.getNo_of_adults());
		    bd.setNo_of_children(bookingdetails.getNo_of_children());
		    return bd;
		}
		else
			throw new BookingDetailsNotFoundException("Booking details are not found");
	}

	@Override
	public String removeBookingDetails(int booking_id) throws BookingDetailsNotFoundException{
		if(repo.findById(booking_id).isPresent()) {
		   BookingDetails bd= repo.getById(booking_id);
		   repo.deleteById(booking_id);
		   return "Booking details are deleted";
	   }else
		   throw new BookingDetailsNotFoundException("Booking details are not found");
	}

	@Override
	public List<BookingDetails> showAllBookingDetails() throws BookingDetailsNotFoundException{
		List<BookingDetails> list=repo.findAll();
		if(list.isEmpty())
			throw new BookingDetailsNotFoundException("Booking details are not found");
	    return list;
	}

	@Override
	public BookingDetails showBookingDetails(int booking_id) throws BookingDetailsNotFoundException{
		if(repo.findById(booking_id).isPresent()) {
		    BookingDetails bd= repo.getById(booking_id);
		    return bd;
		}
		else
			throw new BookingDetailsNotFoundException("Booking details are not found");
	}

}