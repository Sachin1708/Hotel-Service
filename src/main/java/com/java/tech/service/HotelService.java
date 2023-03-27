package com.java.tech.service;

import java.util.List;

import com.java.tech.entity.Hotel;

public interface HotelService {

	//create hotel 
	Hotel createHotel(Hotel hotel);
	
	//get all hotel data
	List<Hotel> getAllHotelData();
	
	//get hotel by id
	Hotel getHotelByHotelId(String hotelId);
	
}
