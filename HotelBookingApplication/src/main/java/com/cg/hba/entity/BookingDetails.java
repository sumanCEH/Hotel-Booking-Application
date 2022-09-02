package com.cg.hba.entity;

import java.util.Date;

import java.io.Serializable;
import java.util.Date; 


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Component
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class BookingDetails implements Serializable{

 @Id	
 private int booking_id;
 private int hotel_id;
 private int room_id;
 
 @JsonFormat(pattern = "yyyy/MM/dd")
 private Date booked_from;
 
 @JsonFormat(pattern = "yyyy/MM/dd")
 private Date booked_to;
 private int no_of_adults;
 private int no_of_children;
 private double amount;

 
public BookingDetails() {
	super();
	// TODO Auto-generated constructor stub
}

public BookingDetails(int booking_id, int hotel_id, int room_id, Date booked_from, Date booked_to, int no_of_adults,
		int no_of_children, double amount) {
	super();
	this.booking_id = booking_id;
	this.hotel_id = hotel_id;
	this.room_id = room_id;
	this.booked_from = booked_from;
	this.booked_to = booked_to;
	this.no_of_adults = no_of_adults;
	this.no_of_children = no_of_children;
	this.amount = amount;
}

public int getBooking_id() {
	return booking_id;
}

public void setBooking_id(int booking_id) {
	this.booking_id = booking_id;
}

public int getHotel_id() {
	return hotel_id;
}

public void setHotel_id(int hotel_id) {
	this.hotel_id = hotel_id;
}

public int getRoom_id() {
	return room_id;
}

public void setRoom_id(int room_id) {
	this.room_id = room_id;
}

public Date getBooked_from() {
	return booked_from;
}

public void setBooked_from(Date booked_from) {
	this.booked_from = booked_from;
}

public Date getBooked_to() {
	return booked_to;
}
public void setBooked_to(Date booked_to) {
	this.booked_to = booked_to;
}

public int getNo_of_adults() {
	return no_of_adults;
}

public void setNo_of_adults(int no_of_adults) {
	this.no_of_adults = no_of_adults;
}

public int getNo_of_children() {
	return no_of_children;
}

public void setNo_of_children(int no_of_children) {
	this.no_of_children = no_of_children;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

@Override
public String toString() {
	return "BookingDetails [booking_id=" + booking_id + ", hotel_id=" + hotel_id + ", room_id=" + room_id
			+ ", booked_from=" + booked_from + ", booked_to=" + booked_to + ", no_of_adults=" + no_of_adults
			+ ", no_of_children=" + no_of_children + ", amount=" + amount + "]";
}

}


