package com.lowestroomrates.hotels.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "roomratedetailslist")
public class HotelRoomAvailInfos {
	
	private  List<HotelRoomAvailInfo> hotelroomavailinfos;

	@XmlElement(name = "roomratedetails")
	public List<HotelRoomAvailInfo> getHotelroomavailinfos() {
		return hotelroomavailinfos;
	}

	public void setHotelroomavailinfos(List<HotelRoomAvailInfo> hotelroomavailinfos) {
		this.hotelroomavailinfos = hotelroomavailinfos;
	}

	
	
}
