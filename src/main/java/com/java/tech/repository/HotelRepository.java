package com.java.tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.tech.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String>{

}
