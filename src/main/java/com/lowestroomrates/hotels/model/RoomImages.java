package com.lowestroomrates.hotels.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class RoomImages {
    private List<RoomImage> roomimage;
	
	@XmlElement(name="roomimage")
	public List<RoomImage> getRoomimage() {
		return roomimage;
	}

	public void setRoomimage(List<RoomImage> roomimage) {
		this.roomimage = roomimage;
	}
}
