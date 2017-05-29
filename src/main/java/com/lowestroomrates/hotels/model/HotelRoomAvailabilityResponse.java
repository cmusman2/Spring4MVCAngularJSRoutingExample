package com.lowestroomrates.hotels.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hotelroomavailabilityresponse", namespace="http://v3.hotel.wsapi.ean.com/")
public class HotelRoomAvailabilityResponse {
	private int hotelId;
	private String arrivalDate;
	private String departureDate;
	private String hotelName;
	private String hotelAddress;
	private String hotelCity;
	private String hotelStateProvince;
	private String hotelCountry;
	private int numberOfRoomsRequested;
	private String checkInInstructions;
	private String specialCheckinInstructions;
	private List<HotelRoomAvailInfo> hotelRooms;

	@XmlElement(name="hotelid")
	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	@XmlElement(name="arrivaldate")
	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	@XmlElement(name="departuredate")
	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	@XmlElement(name="hotelname")
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	@XmlElement(name="hoteladdress")
	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	@XmlElement(name="hotelcity")
	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	@XmlElement(name="hotelstateprovince")
	public String getHotelStateProvince() {
		return hotelStateProvince;
	}

	public void setHotelStateProvince(String hotelStateProvince) {
		this.hotelStateProvince = hotelStateProvince;
	}

	@XmlElement(name="hotelcountry")
	public String getHotelCountry() {
		return hotelCountry;
	}

	public void setHotelCountry(String hotelCountry) {
		this.hotelCountry = hotelCountry;
	}

	@XmlElement(name="numberofroomsrequested")
	public int getNumberOfRoomsRequested() {
		return numberOfRoomsRequested;
	}

	public void setNumberOfRoomsRequested(int numberOfRoomsRequested) {
		this.numberOfRoomsRequested = numberOfRoomsRequested;
	}

	@XmlElement(name="checkininstructions")
	public String getCheckInInstructions() {
		return checkInInstructions;
	}

	public void setCheckInInstructions(String checkInInstructions) {
		this.checkInInstructions = checkInInstructions;
	}

	@XmlElement(name="specialcheckininstructions")
	public String getSpecialCheckinInstructions() {
		return specialCheckinInstructions;
	}

	public void setSpecialCheckinInstructions(String specialCheckinInstructions) {
		this.specialCheckinInstructions = specialCheckinInstructions;
	}

	@XmlElement(name="hotelroomresponse")
	public List<HotelRoomAvailInfo> getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(List<HotelRoomAvailInfo> hotelRooms) {
		this.hotelRooms = hotelRooms;
	}

}
