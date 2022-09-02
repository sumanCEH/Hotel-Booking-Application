package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.dto.RoomDetailsDTO;
import com.capgemini.entity.RoomDetailsEntity;
import com.capgemini.entity.service.RoomDetailsService;

@RestController
@CrossOrigin
public class RoomDetailsController {
	
	@Autowired 
	RoomDetailsService rservice;
	
	@PostMapping("/room/add")
	public String addroom(@RequestBody RoomDetailsDTO room) {
		return rservice.addRoomDetails(room);
		
	}
	
	@PutMapping("/room/update")
	public String updateroom(@RequestBody RoomDetailsDTO room) {
		return rservice.updateRoomDetails(room);
	}
	
	@DeleteMapping("/room/delete")
	public String deleteroom( @RequestBody RoomDetailsDTO room) {
		return rservice.removeRoomDetails(room);
	}
	
	@GetMapping("/room/getall")
	public List<RoomDetailsEntity> getall(){
		return rservice.showAllRoomDetails();
	}
	
	@GetMapping("/room/getroom/{id}")
	public RoomDetailsDTO getroom(@PathVariable Integer id) {
		return rservice.showRoomDetails(id);
	}

}
