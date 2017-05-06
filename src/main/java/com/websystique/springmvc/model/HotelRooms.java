package com.websystique.springmvc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="roomtypes")
public class HotelRooms {
	 
	 public List<HotelRoomDetails> HotelRoomDetails;

	 @XmlElement(name = "roomtype")
	public List<HotelRoomDetails> getHotelRoomDetails() {
		return HotelRoomDetails;
	}

	public void setHotelRoomDetails(List<HotelRoomDetails> hotelRoomDetails) {
		HotelRoomDetails = hotelRoomDetails;
	}
}
