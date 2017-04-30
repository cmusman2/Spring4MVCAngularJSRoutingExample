package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;

public class HotelDetailsDescription {
	
	private int numberOfRooms;
	private int numberOfFloors;
	private String checkInTime;
	private String checkOutTime;
	private String propertyInformation;
	private String areaInformation;
	private String propertyDescription;
	private String hotelPolicy;
	private String roomInformation;
	private String drivingDirections;
	private String checkInInstructions;
	private String knowBeforeYouGoDescription;
	private String roomFeesDescription;
	private String mandatoryFeesDescription;
	private String renovationsDescription;
	private String locationDescription;
	private String diningDescription;
	private String amenitiesDescription;
	private String businessAmenitiesDescription;
	private String roomDetailDescription;

	@XmlElement
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	@XmlElement
	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	@XmlElement
	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}
	@XmlElement
	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	@XmlElement
	public String getPropertyInformation() {
		return propertyInformation;
	}

	public void setPropertyInformation(String propertyInformation) {
		this.propertyInformation = propertyInformation;
	}
	@XmlElement
	public String getAreaInformation() {
		return areaInformation;
	}

	public void setAreaInformation(String areaInformation) {
		this.areaInformation = areaInformation;
	}
	@XmlElement
	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}
	@XmlElement
	public String getHotelPolicy() {
		return hotelPolicy;
	}

	public void setHotelPolicy(String hotelPolicy) {
		this.hotelPolicy = hotelPolicy;
	}
	@XmlElement
	public String getRoomInformation() {
		return roomInformation;
	}

	public void setRoomInformation(String roomInformation) {
		this.roomInformation = roomInformation;
	}
	@XmlElement
	public String getDrivingDirections() {
		return drivingDirections;
	}

	public void setDrivingDirections(String drivingDirections) {
		this.drivingDirections = drivingDirections;
	}
	@XmlElement
	public String getCheckInInstructions() {
		return checkInInstructions;
	}

	public void setCheckInInstructions(String checkInInstructions) {
		this.checkInInstructions = checkInInstructions;
	}
	@XmlElement
	public String getKnowBeforeYouGoDescription() {
		return knowBeforeYouGoDescription;
	}

	public void setKnowBeforeYouGoDescription(String knowBeforeYouGoDescription) {
		this.knowBeforeYouGoDescription = knowBeforeYouGoDescription;
	}
	@XmlElement
	public String getRoomFeesDescription() {
		return roomFeesDescription;
	}

	public void setRoomFeesDescription(String roomFeesDescription) {
		this.roomFeesDescription = roomFeesDescription;
	}
	@XmlElement
	public String getMandatoryFeesDescription() {
		return mandatoryFeesDescription;
	}

	public void setMandatoryFeesDescription(String mandatoryFeesDescription) {
		this.mandatoryFeesDescription = mandatoryFeesDescription;
	}
	@XmlElement
	public String getRenovationsDescription() {
		return renovationsDescription;
	}

	public void setRenovationsDescription(String renovationsDescription) {
		this.renovationsDescription = renovationsDescription;
	}
	@XmlElement
	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}
	@XmlElement
	public String getDiningDescription() {
		return diningDescription;
	}

	public void setDiningDescription(String diningDescription) {
		this.diningDescription = diningDescription;
	}
	@XmlElement
	public String getAmenitiesDescription() {
		return amenitiesDescription;
	}

	public void setAmenitiesDescription(String amenitiesDescription) {
		this.amenitiesDescription = amenitiesDescription;
	}
	@XmlElement
	public String getBusinessAmenitiesDescription() {
		return businessAmenitiesDescription;
	}

	public void setBusinessAmenitiesDescription(String businessAmenitiesDescription) {
		this.businessAmenitiesDescription = businessAmenitiesDescription;
	}
	@XmlElement
	public String getRoomDetailDescription() {
		return roomDetailDescription;
	}

	public void setRoomDetailDescription(String roomDetailDescription) {
		this.roomDetailDescription = roomDetailDescription;
	}


}
