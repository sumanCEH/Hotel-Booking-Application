package com.capgemini.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class Payment {
	
	@Id
	@SequenceGenerator(
			name = "payment_sequence",
			sequenceName = "payment_sequence",
			allocationSize = 1
	)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "payment_sequence"
	)
	private Integer payment_id;

	
	@OneToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			optional = false
	)
	@JoinColumn(
			name = "transaction_id",
			referencedColumnName = "transaction_id"
	)
	private Transaction transaction;
	
	@ManyToOne(
			cascade = CascadeType.ALL,
			fetch = FetchType.LAZY,
			optional = false
	)
	@JoinColumn(
			name = "booking_id",
			referencedColumnName = "booking_id"
	)
	private BookingDetails bookingDetails;
	
	

}
