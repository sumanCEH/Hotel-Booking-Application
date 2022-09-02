package com.cg.hba;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.hba.entity.BookingDetails;
import com.cg.hba.repositoy.IBookingDetailsRepository;
import com.cg.hba.service.IBookingDetailsService;

@SpringBootTest
class HotelBookingApplicationTests{

	@Autowired
	IBookingDetailsService service;
	
	@Autowired
	IBookingDetailsRepository repo; 
	
	@Test
	void testgetBookingDetailsbyId() {
		BookingDetails bd = new BookingDetails(3,106,114,new Date(),new Date(),2,2,8000);
		repo.save(bd);
		assertThat(repo.findById(bd.getBooking_id()).isPresent());
		repo.deleteAll();
		}
	
	@Test
	void testsaveBookingDetails() {
		BookingDetails bd = new BookingDetails(3,106,114,new Date(),new Date(),2,2,7000);
		repo.save(bd);
		Iterable<BookingDetails> it= repo.findAll();
		List<BookingDetails> list = new ArrayList<>();
		for (BookingDetails b : it) {
			list.add(b);
		}
		assertThat(list.size()).isEqualTo(1);
		repo.deleteAll();
		}
	
	@Test
	void testupdateBookingDetailsbyId() {
		BookingDetails bd = new BookingDetails(3,106,114,new Date(),new Date(),2,2,8000);
		repo.save(bd);
		bd.setNo_of_children(3);
		repo.save(bd);
        assertThat(repo.findById(3).get().getNo_of_children()).isEqualTo(3);
		repo.deleteAll();
		}
	
	@Test
	void testgetAllBookingDetails() {
		BookingDetails bd = new BookingDetails(3,106,114,new Date(),new Date(),2,2,7000);
		BookingDetails bd1 = new BookingDetails(4,107,112,new Date(),new Date(),2,2,8000);
		repo.save(bd);
		repo.save(bd1);
		Iterable<BookingDetails> it= repo.findAll();
		List<BookingDetails> list = new ArrayList<>();
		for (BookingDetails b : it) {
			list.add(b);
		}
		assertThat(list.size()).isEqualTo(2);
		repo.deleteAll();
		}
    
	@Test
	void testdeleteBookingDetails() {
		BookingDetails bd = new BookingDetails(3,106,114,new Date(),new Date(),2,2,7000);
		BookingDetails bd1 = new BookingDetails(4,107,112,new Date(),new Date(),2,2,8000);
		repo.save(bd);
		repo.save(bd1);
		repo.deleteById(4);
		Iterable<BookingDetails> it= repo.findAll();
		List<BookingDetails> list = new ArrayList<>();		
		for (BookingDetails b : it) {
			list.add(b);
		}
		assertThat(list.size()).isEqualTo(1);
		repo.deleteAll();
		}
}
