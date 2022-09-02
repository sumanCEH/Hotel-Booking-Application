package com.roomdetails.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roomdetails.dto.RoomDetailsDTO;
import com.roomdetails.entity.RoomDetailsEntity;
import com.roomdetails.repository.RoomDetailsRepository;

@Service
public class RoomDetailsService {
	@Autowired
	RoomDetailsRepository rrepo;
	@Autowired 
	ModelMapper mapper;
	
	public String addRoomDetails(RoomDetailsDTO room) {
		
		RoomDetailsEntity roomEntity= mapper.map(room, RoomDetailsEntity.class);
		rrepo.save(roomEntity);
		return "Room Added successfully";
		
	}
	public String updateRoomDetails(RoomDetailsDTO room) {
		Integer id = room.getRoomId();
		Optional<RoomDetailsEntity> roomEntity= rrepo.findById(id);
		roomEntity.get().setHotelId(room.getHotelId());
		roomEntity.get().setIsAvailable(room.getIsAvailable());
		roomEntity.get().setRatePerDay(room.getRatePerDay());
		roomEntity.get().setRoomNo(room.getRoomNo());
		rrepo.save(roomEntity.get());
		return "Room Details updated";
	}
	public String removeRoomDetails(RoomDetailsDTO room) {
		Integer id = room.getRoomId();
		rrepo.deleteById(id);
		return "Room details removed succesfully";
	}
	public List<RoomDetailsEntity> showAllRoomDetails(){
	   return rrepo.findAll();
		
	
	}
	
	public  RoomDetailsDTO showRoomDetails(Integer id) {
		Optional<RoomDetailsEntity> roomEntity=rrepo.findById(id);
		RoomDetailsDTO roomDTO=mapper.map(roomEntity.get(), RoomDetailsDTO.class);
		return roomDTO;
	}

}
