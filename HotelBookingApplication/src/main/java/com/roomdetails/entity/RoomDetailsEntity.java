package com.roomdetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoomDetailsEntity {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer roomId;
	private Integer hotelId;
	private String roomNo;
	private Double ratePerDay;
	private Boolean isAvailable;
	public RoomDetailsEntity() {
		
	}
	public RoomDetailsEntity(Integer roomId, Integer hotelId, String roomNo, Double ratePerDay, Boolean isAvailable) {
		super();
		this.roomId = roomId;
		this.hotelId = hotelId;
		this.roomNo = roomNo;
		this.ratePerDay = ratePerDay;
		this.isAvailable = isAvailable;
	}
	public Integer getRoomId() {
		return roomId;
	}
	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public Double getRatePerDay() {
		return ratePerDay;
	}
	public void setRatePerDay(Double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	

}
