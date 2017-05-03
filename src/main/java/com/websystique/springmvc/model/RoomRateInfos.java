package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rateinfos")
public class RoomRateInfos {
	private RoomRateInfo[] roomratedetialinfo;

	@XmlElement(name = "rateinfo")
	public RoomRateInfo[] getRoomratedetialinfo() {
		return roomratedetialinfo;
	}

	public void setRoomratedetialinfo(RoomRateInfo[] roomratedetialinfo) {
		this.roomratedetialinfo = roomratedetialinfo;
	}

}
