package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "chargeablerateinfo")
public class ChargeableRateInfo {
	private float averagebaserate;
	private float averagerate;
	private String currencycode;
	private float nightlyratetotal;
	private float surchargetotal;
	private float total;
	private boolean nonrefundable;
	private String rateType;
	private String currentallotment;

	@XmlAttribute
	public float getAveragebaserate() {
		return averagebaserate;
	}

	public void setAveragebaserate(float averagebaserate) {
		this.averagebaserate = averagebaserate;
	}

	@XmlAttribute
	public float getAveragerate() {
		return averagerate;
	}

	public void setAveragerate(float averagerate) {
		this.averagerate = averagerate;
	}
	
	@XmlAttribute
	public String getCurrecncycode() {
		return currencycode;
	}

	public void setCurrecncycode(String currecncycode) {
		this.currencycode = currecncycode;
	}

	@XmlAttribute
	public float getNightlyratetotal() {
		return nightlyratetotal;
	}

	public void setNightlyratetotal(float nightlyratetotal) {
		this.nightlyratetotal = nightlyratetotal;
	}

	@XmlAttribute
	public float getSurchargetotal() {
		return surchargetotal;
	}

	public void setSurchargetotal(float surchargetotal) {
		this.surchargetotal = surchargetotal;
	}

	@XmlAttribute
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@XmlElement
	public boolean isNonrefundable() {
		return nonrefundable;
	}

	public void setNonrefundable(boolean nonrefundable) {
		this.nonrefundable = nonrefundable;
	}

	@XmlElement
	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	@XmlElement
	public String getCurrentallotment() {
		return currentallotment;
	}

	public void setCurrentallotment(String currentallotment) {
		this.currentallotment = currentallotment;
	}

}
