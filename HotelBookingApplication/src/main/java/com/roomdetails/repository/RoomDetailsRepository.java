package com.roomdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roomdetails.entity.RoomDetailsEntity;

@Repository
public interface RoomDetailsRepository extends JpaRepository<RoomDetailsEntity,Integer> {
//List<RoomDetailsEntity> findByRatePerDay(Double rate);
//List<RoomDetailsEntity> findByIsAvailableAndRatePerDay(Boolean available,Double rate);
}
