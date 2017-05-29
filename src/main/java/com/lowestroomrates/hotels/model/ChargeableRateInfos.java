package com.lowestroomrates.hotels.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="chargeablerateinfos")
public class ChargeableRateInfos {
	private ChargeableRateInfo[] hotelroomavailinfo;

	@XmlElement(name="chargeablerateinfo")
	public ChargeableRateInfo[] getHotelroomavailinfo() {
		return hotelroomavailinfo;
	}

	public void setHotelroomavailinfo(ChargeableRateInfo[] hotelroomavailinfo) {
		this.hotelroomavailinfo = hotelroomavailinfo;
	}
}
