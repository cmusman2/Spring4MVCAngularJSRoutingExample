package com.lowestroomrates.hotels.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rateinfo")
public class RoomRateInfo {

	private ChargeableRateInfo chargeablerates;
	// private ChargeableRateInfo[] alternatechargeablerates;

	private String cancellationPolicy;
	private String nonRefundable;
	private String rateType;
	private int currentAllotment;

	private boolean guaranteeRequired;
	private boolean depositRequired;
	private RoomGroup roomgroup;

	@XmlElement(name="cancellationpolicy")
	public String getCancellationPolicy() {
		return cancellationPolicy;
	}


	public void setCancellationPolicy(String cancellationPolicy) {
		this.cancellationPolicy = cancellationPolicy;
	}
	 

	@XmlElement(name="nonrefundable")
	public String getNonRefundable() {
		return nonRefundable;
	}


	public void setNonRefundable(String nonRefundable) {
		this.nonRefundable = nonRefundable;
	}


	@XmlElement(name="ratetype")
	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	
	@XmlElement(name="currentallotment")
	public int getCurrentAllotment() {
		return currentAllotment;
	}

	public void setCurrentAllotment(int currentAllotment) {
		this.currentAllotment = currentAllotment;
	}

	@XmlElement(name="guaranteerequired")
	public boolean isGuaranteeRequired() {
		return guaranteeRequired;
	}

	public void setGuaranteeRequired(boolean guaranteeRequired) {
		this.guaranteeRequired = guaranteeRequired;
	}

	@XmlElement(name="depositrequired")
	public boolean isDepositRequired() {
		return depositRequired;
	}

	public void setDepositRequired(boolean depositRequired) {
		this.depositRequired = depositRequired;
	}
 
	@XmlElement(name = "roomgroup")
	public RoomGroup getRoomgroup() {
		return roomgroup;
	}

	public void setRoomgroup(RoomGroup roomgroup) {
		this.roomgroup = roomgroup;
	}

	@XmlElement(name = "chargeablerateinfo")
	public ChargeableRateInfo getChargeablerates() {
		return chargeablerates;
	}

	public void setChargeablerates(ChargeableRateInfo chargeablerates) {
		this.chargeablerates = chargeablerates;
	}
 
}
