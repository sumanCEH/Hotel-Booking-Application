package com.cg.hba;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.hba.controller.UserController;

@SpringBootTest
class HotelBookingApplicationTests {
	
	@Autowired
	UserController userController;
	
	
	

	@Test
	void contextLoads() {
		
		assertThat(userController).isNotNull();
		
	}


}
