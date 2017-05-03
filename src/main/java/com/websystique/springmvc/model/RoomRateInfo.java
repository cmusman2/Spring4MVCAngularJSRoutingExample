package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rateinfo")
public class RoomRateInfo {

	private ChargeableRateInfo chargeablerates;
	//private ChargeableRateInfo[] alternatechargeablerates;

	

	@XmlElement(name = "chargeablerateinfo")
	public ChargeableRateInfo getChargeablerates() {
		return chargeablerates;
	}

	public void setChargeablerates(ChargeableRateInfo chargeablerates) {
		this.chargeablerates = chargeablerates;
	}
 


}
