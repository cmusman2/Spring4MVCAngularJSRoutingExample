package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "roomratedetails")
public class HotelRoomAvailInfo {
	
    private String roomtypecode;
    private String ratecode;
    private String maxroomoccupancy;
	private String roomdescription;
	private RoomRateInfos roomrateinfos;
	
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
