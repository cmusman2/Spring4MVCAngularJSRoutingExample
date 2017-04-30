package com.websystique.springmvc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class HotelRooms {
	 
	 public List<HotelRoomDetails> HotelRoomDetails;

	 @XmlElement(name = "RoomType")
	public List<HotelRoomDetails> getHotelRoomDetails() {
		return HotelRoomDetails;
	}

	public void setHotelRoomDetails(List<HotelRoomDetails> hotelRoomDetails) {
		HotelRoomDetails = hotelRoomDetails;
	}
}
