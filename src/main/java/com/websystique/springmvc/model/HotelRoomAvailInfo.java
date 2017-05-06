package com.websystique.springmvc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "roomratedetails")
public class HotelRoomAvailInfo {
	
    private String roomtypecode;
    private String ratecode;
    private String maxroomoccupancy;
	private String roomdescription;
	private RoomRateInfos roomrateinfos;
	private String ratedescription;
	private String roomtypedescription;
	private String suppliertype;
	private String propertyid;
	private String smokingpreferences;
	private String rateoccupancyperroom;
	private String quotedoccupany;
	private String minguestage;
	
	private List<HotelImage> roomimages;
	
	@XmlElement(name="roomimages")
	public List<HotelImage> getRoomimages() {
		return roomimages;
	}

	public void setRoomimages(List<HotelImage> roomimages) {
		this.roomimages = roomimages;
	}

	public String getRatedescription() {
		return ratedescription;
	}

	public void setRatedescription(String ratedescription) {
		this.ratedescription = ratedescription;
	}

	public String getRoomtypedescription() {
		return roomtypedescription;
	}

	public void setRoomtypedescription(String roomtypedescription) {
		this.roomtypedescription = roomtypedescription;
	}

	public String getSuppliertype() {
		return suppliertype;
	}

	public void setSuppliertype(String suppliertype) {
		this.suppliertype = suppliertype;
	}

	public String getPropertyid() {
		return propertyid;
	}

	public void setPropertyid(String propertyid) {
		this.propertyid = propertyid;
	}

	public String getSmokingpreferences() {
		return smokingpreferences;
	}

	public void setSmokingpreferences(String smokingpreferences) {
		this.smokingpreferences = smokingpreferences;
	}

	public String getRateoccupancyperroom() {
		return rateoccupancyperroom;
	}

	public void setRateoccupancyperroom(String rateoccupancyperroom) {
		this.rateoccupancyperroom = rateoccupancyperroom;
	}

	public String getQuotedoccupany() {
		return quotedoccupany;
	}

	public void setQuotedoccupany(String quotedoccupany) {
		this.quotedoccupany = quotedoccupany;
	}

	public String getMinguestage() {
		return minguestage;
	}

	public void setMinguestage(String minguestage) {
		this.minguestage = minguestage;
	}

	private RoomRateValueAdds valueadds;
	@XmlElement(name = "valueadds")
	public RoomRateValueAdds getValueadds() {
		return valueadds;
	}

	public void setValueadds(RoomRateValueAdds valueadds) {
		this.valueadds = valueadds;
	}
	
	@XmlElement(name="rateinfos")
	public RoomRateInfos getRoomrateinfos() {
		return roomrateinfos;
	}

	public void setRoomrateinfos(RoomRateInfos roomrateinfos) {
		this.roomrateinfos = roomrateinfos;
	}

	@XmlElement(name="roomtypecode")
	public String getRoomtypecode() {
		return roomtypecode;
	}

	public void setRoomtypecode(String roomtypecode) {
		this.roomtypecode = roomtypecode;
	}

	@XmlElement(name="ratecode")
	public String getRatecode() {
		return ratecode;
	}

	public void setRatecode(String ratecode) {
		this.ratecode = ratecode;
	}

	@XmlElement(name="maxroomoccupancy")
	public String getMaxroomoccupancy() {		
		return maxroomoccupancy;
	}

	public void setMaxroomoccupancy(String maxroomoccupancy) {
		this.maxroomoccupancy = maxroomoccupancy;
	}

	@XmlElement
	public String getRoomdescription() {
		return roomdescription;
	}

	public void setRoomdescription(String roomdescription) {
		this.roomdescription = roomdescription;
	} 
 
}
