package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;

public class HotelRoomDetails {
	
	private String roomCode;
	private String roomTypeId;
	private String description;
	private String descriptionLong;
	private RoomAmenities RoomAmenitiesDetails;
	
	
	@XmlElement(name="roomcode")
	public String getRoomCode() {
		return roomCode;
	}

	public void setRoomCode(String roomCode) {
		this.roomCode = roomCode;
	}
	@XmlElement(name="roomtypeid")
	public String getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	@XmlElement
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@XmlElement(name="descriptionlong")
	public String getDescriptionLong() {
		return descriptionLong;
	}

	public void setDescriptionLong(String descriptionLong) {
		this.descriptionLong = descriptionLong;
	}
	@XmlElement(name="roomAmenitiesdetails")
	public RoomAmenities getRoomAmenitiesDetails() {
		return RoomAmenitiesDetails;
	}

	public void setRoomAmenitiesDetails(RoomAmenities roomAmenitiesDetails) {
		RoomAmenitiesDetails = roomAmenitiesDetails;
	}

}
