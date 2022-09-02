package com.capgemini.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.BookingDetails;

public interface IBookingDetailsRepository extends JpaRepository<BookingDetails, Integer>{

}

