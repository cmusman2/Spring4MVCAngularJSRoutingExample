package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "roomratedetailslist")
public class HotelRoomAvailInfos {
	
	private HotelRoomAvailInfo[] hotelroomavailinfos;

	@XmlElement(name = "roomratedetails")
	public HotelRoomAvailInfo[] getHotelroomavailinfos() {
		return hotelroomavailinfos;
	}

	public void setHotelroomavailinfos(HotelRoomAvailInfo[] hotelroomavailinfos) {
		this.hotelroomavailinfos = hotelroomavailinfos;
	}

}
