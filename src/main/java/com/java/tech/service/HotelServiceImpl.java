package com.java.tech.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.tech.entity.Hotel;
import com.java.tech.exception.ResourceNotFoundException;
import com.java.tech.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel createHotel(Hotel hotel) {

        String hotelId=UUID.randomUUID().toString();
        hotel.setHotelId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotelData() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel getHotelByHotelId(String hotelId) {
		
		return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Given hotel Id not found "+hotelId));
	}

}
