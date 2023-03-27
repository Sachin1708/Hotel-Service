package com.java.tech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name="Hotel")
public class Hotel {

	@Id
	private String hotelId;
	private String name;
	private String location;
	private String about;
}
