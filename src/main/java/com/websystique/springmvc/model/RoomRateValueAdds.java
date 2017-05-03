package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "valueadds")
public class RoomRateValueAdds {
	private RoomRateValueAdd[] roomratevalueAdds;

	@XmlElement(name = "valueadd")
	public RoomRateValueAdd[] getRoomratevalueAdds() {
		return roomratevalueAdds;
	}

	public void setRoomratevalueAdds(RoomRateValueAdd[] roomratevalueAdds) {
		this.roomratevalueAdds = roomratevalueAdds;
	}

}
