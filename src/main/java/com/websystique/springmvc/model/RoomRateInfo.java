package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rateinfo")
public class RoomRateInfo {

	private ChargeableRateInfo chargeablerates;
	// private ChargeableRateInfo[] alternatechargeablerates;

	private String cancellationPolicy;
	private boolean nonRefundaable;
	private String rateType;
	private int currentAllotment;

	private boolean guaranteeRequired;
	private boolean depositRequired;
	private RoomGroup roomgroup;

	@XmlElement(name="cancellationPolicy")
	public String getCancellationPolicy() {
		return cancellationPolicy;
	}

	public void setCancellationPolicy(String cancellationPolicy) {
		this.cancellationPolicy = cancellationPolicy;
	}

	public boolean isNonRefundaable() {
		return nonRefundaable;
	}

	public void setNonRefundaable(boolean nonRefundaable) {
		this.nonRefundaable = nonRefundaable;
	}

	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}
	
	public int getCurrentAllotment() {
		return currentAllotment;
	}

	public void setCurrentAllotment(int currentAllotment) {
		this.currentAllotment = currentAllotment;
	}

	public boolean isGuaranteeRequired() {
		return guaranteeRequired;
	}

	public void setGuaranteeRequired(boolean guaranteeRequired) {
		this.guaranteeRequired = guaranteeRequired;
	}

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
