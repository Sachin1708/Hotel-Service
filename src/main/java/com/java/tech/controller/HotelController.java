package com.java.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.tech.entity.Hotel;
import com.java.tech.service.HotelService;

@RestController
public class HotelController {

	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/createHotel")
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		
		Hotel hotelData=hotelService.createHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotelData);
	}
	
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> findUserByUserId(@PathVariable String hotelId) {
		
		Hotel hotelData= hotelService.getHotelByHotelId(hotelId);
		return ResponseEntity.ok(hotelData);
	}
	
	@GetMapping("/findAllHotels")
	public ResponseEntity<List<Hotel>> findAllUsers(){
		
		List<Hotel> hotelDataList= hotelService.getAllHotelData();
		return ResponseEntity.ok(hotelDataList);
	}
	
	
}
