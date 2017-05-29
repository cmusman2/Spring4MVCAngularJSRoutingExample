package com.lowestroomrates.hotels.model;

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

	@XmlElement(name="numberofrooms")
	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	@XmlElement(name="numberoffloors")
	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}
	@XmlElement(name="checkintime")
	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}
	@XmlElement(name="checkouttime")
	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	@XmlElement(name="propertyinformation")
	public String getPropertyInformation() {
		return propertyInformation;
	}

	public void setPropertyInformation(String propertyInformation) {
		this.propertyInformation = propertyInformation;
	}
	@XmlElement(name="areainformation")
	public String getAreaInformation() {
		return areaInformation;
	}

	public void setAreaInformation(String areaInformation) {
		this.areaInformation = areaInformation;
	}
	@XmlElement(name="propertydescription")
	public String getPropertyDescription() {
		return propertyDescription;
	}

	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}
	@XmlElement(name="hotelpolicy")
	public String getHotelPolicy() {
		return hotelPolicy;
	}

	public void setHotelPolicy(String hotelPolicy) {
		this.hotelPolicy = hotelPolicy;
	}
	@XmlElement(name="roominformation")
	public String getRoomInformation() {
		return roomInformation;
	}

	public void setRoomInformation(String roomInformation) {
		this.roomInformation = roomInformation;
	}
	@XmlElement(name="drivingdirections")
	public String getDrivingDirections() {
		return drivingDirections;
	}

	public void setDrivingDirections(String drivingDirections) {
		this.drivingDirections = drivingDirections;
	}
	@XmlElement(name="checkininstructions")
	public String getCheckInInstructions() {
		return checkInInstructions;
	}

	public void setCheckInInstructions(String checkInInstructions) {
		this.checkInInstructions = checkInInstructions;
	}
	@XmlElement(name="knowBeforeyougodescription")
	public String getKnowBeforeYouGoDescription() {
		return knowBeforeYouGoDescription;
	}

	public void setKnowBeforeYouGoDescription(String knowBeforeYouGoDescription) {
		this.knowBeforeYouGoDescription = knowBeforeYouGoDescription;
	}
	@XmlElement(name="roomfeesdescription")
	public String getRoomFeesDescription() {
		return roomFeesDescription;
	}

	public void setRoomFeesDescription(String roomFeesDescription) {
		this.roomFeesDescription = roomFeesDescription;
	}
	@XmlElement(name="mandatoryfeesdescription")
	public String getMandatoryFeesDescription() {
		return mandatoryFeesDescription;
	}

	public void setMandatoryFeesDescription(String mandatoryFeesDescription) {
		this.mandatoryFeesDescription = mandatoryFeesDescription;
	}
	@XmlElement(name="renovationsdescription")
	public String getRenovationsDescription() {
		return renovationsDescription;
	}

	public void setRenovationsDescription(String renovationsDescription) {
		this.renovationsDescription = renovationsDescription;
	}
	@XmlElement(name="locationdescription")
	public String getLocationDescription() {
		return locationDescription;
	}

	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}
	@XmlElement(name="diningdescription")
	public String getDiningDescription() {
		return diningDescription;
	}

	public void setDiningDescription(String diningDescription) {
		this.diningDescription = diningDescription;
	}
	@XmlElement(name="amenitiesdescription")
	public String getAmenitiesDescription() {
		return amenitiesDescription;
	}

	public void setAmenitiesDescription(String amenitiesDescription) {
		this.amenitiesDescription = amenitiesDescription;
	}
	@XmlElement(name="businessamenitiesdescription")
	public String getBusinessAmenitiesDescription() {
		return businessAmenitiesDescription;
	}

	public void setBusinessAmenitiesDescription(String businessAmenitiesDescription) {
		this.businessAmenitiesDescription = businessAmenitiesDescription;
	}
	@XmlElement(name="roomdetaildescription")
	public String getRoomDetailDescription() {
		return roomDetailDescription;
	}

	public void setRoomDetailDescription(String roomDetailDescription) {
		this.roomDetailDescription = roomDetailDescription;
	}


}
