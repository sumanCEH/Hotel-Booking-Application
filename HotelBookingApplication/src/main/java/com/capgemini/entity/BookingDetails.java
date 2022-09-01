package com.capgemini.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingDetails {
	
	@Id
	@SequenceGenerator(
			name = "booking_details_sequence",
			sequenceName = "booking_details_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "booking_details_sequence"
	)
	private Integer booking_id;
	private Integer hotel_id;
	private Integer room_id;
	private Integer user_id;
	private LocalDate booked_from;
	private LocalDate booked_to;
	private Integer no_of_adults;
	private Integer no_of_childrens;
	private double amount;
	
//	@OneToMany(
//			cascade = CascadeType.ALL
//	)
//	@JoinColumn(
//			name = "booking_id",
//			referencedColumnName = "booking_id"
//	)
//	private List<Payment> payment;
	
	

}
