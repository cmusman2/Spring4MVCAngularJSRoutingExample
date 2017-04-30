package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HotelInformationResponse", namespace="http://v3.hotel.wsapi.ean.com/")
public class HotelDescription {

    
    private HotelSummaryDetails HotelSummary;
    

	private HotelDetailsDescription HotelDetails;
	private HotelImages HotelImages;
	private HotelRooms HotelRooms;
	private PropertyAmenities PropertyAmenities;

	
    @XmlElement(name = "HotelSummary")
	public HotelSummaryDetails getHotelSummary() {
		return HotelSummary;
	}

	public void setHotelSummary(HotelSummaryDetails hotelSummary) {
		HotelSummary = hotelSummary;
	}

	
	
	@XmlElement(name="HotelDetails")
	public HotelDetailsDescription getHotelDetails() {
		return HotelDetails;
	}

	public void setHotelDetails(HotelDetailsDescription hotelDetails) {
		HotelDetails = hotelDetails;
	}
	
	@XmlElement(name = "HotelImages")
	public HotelImages getHotelImages() {
		return HotelImages;
	}

	public void setHotelImages(HotelImages hotelImages) {
		HotelImages = hotelImages;
	}
	
	@XmlElement(name = "RoomTypes")
	public HotelRooms getHotelRooms() {
		return HotelRooms;
	}

	public void setHotelRooms(HotelRooms hotelRooms) {
		HotelRooms = hotelRooms;
	}
	@XmlElement
	public PropertyAmenities getPropertyAmenities() {
		return PropertyAmenities;
	}

	public void setPropertyAmenities(PropertyAmenities propertyAmenities) {
		PropertyAmenities = propertyAmenities;
	}

}
