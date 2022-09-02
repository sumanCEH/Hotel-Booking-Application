package com.roomdetails;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoomDetailsMsApplication {

	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(RoomDetailsMsApplication.class, args);
	}

}
