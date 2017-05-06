package com.websystique.springmvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hotelinformationresponse", namespace="http://v3.hotel.wsapi.ean.com/")
public class HotelDescription {

    
    private HotelSummaryDetails HotelSummary;
    

	private HotelDetailsDescription HotelDetails;
	private HotelImages HotelImages;
	private HotelRooms HotelRooms;
	private PropertyAmenities PropertyAmenities;

	private List<HotelRoomAvailInfo> roomrates;
	
	@XmlElement(name = "roomrates")
    public List<HotelRoomAvailInfo> getRoomrates() {
		if (roomrates==null) roomrates = new ArrayList<HotelRoomAvailInfo>();
		return roomrates;
	}

	public void setRoomrates(List<HotelRoomAvailInfo> roomrates) {
		this.roomrates = roomrates;
	}

	@XmlElement(name = "hotelsummary")
	public HotelSummaryDetails getHotelSummary() {
		return HotelSummary;
	}

	public void setHotelSummary(HotelSummaryDetails hotelSummary) {
		HotelSummary = hotelSummary;
	}

	
	
	@XmlElement(name="hoteldetails")
	public HotelDetailsDescription getHotelDetails() {
		return HotelDetails;
	}

	public void setHotelDetails(HotelDetailsDescription hotelDetails) {
		HotelDetails = hotelDetails;
	}
	
	@XmlElement(name = "hotelimages")
	public HotelImages getHotelImages() {
		return HotelImages;
	}

	public void setHotelImages(HotelImages hotelImages) {
		HotelImages = hotelImages;
	}
	
	@XmlElement(name = "roomtypes")
	public HotelRooms getHotelRooms() {
		return HotelRooms;
	}

	public void setHotelRooms(HotelRooms hotelRooms) {
		HotelRooms = hotelRooms;
	}
	
	@XmlElement(name="propertyamenities")
	public PropertyAmenities getPropertyAmenities() {
		return PropertyAmenities;
	}

	public void setPropertyAmenities(PropertyAmenities propertyAmenities) {
		PropertyAmenities = propertyAmenities;
	}

}
