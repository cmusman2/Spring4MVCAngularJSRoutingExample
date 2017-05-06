package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;

public class HotelRoomResponse {
	private HotelRoomAvailInfo roomrates;

	@XmlElement(name="rateinfos")
	public HotelRoomAvailInfo getRoomrates() {
		return roomrates;
	}

	public void setRoomrates(HotelRoomAvailInfo roomrates) {
		this.roomrates = roomrates;
	}

}
