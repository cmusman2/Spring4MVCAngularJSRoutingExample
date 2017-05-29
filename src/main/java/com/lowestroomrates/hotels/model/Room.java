package com.lowestroomrates.hotels.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="room")
public class Room {
	private int numberofadults;
	private int numberofchildren;
	private String childages;
	private String ratekey;


	public int getNumberofadults() {
		return numberofadults;
	}

	public void setNumberofadults(int numberofadults) {
		this.numberofadults = numberofadults;
	}

	
	public int getNumberofchildren() {
		return numberofchildren;
	}

	public void setNumberofchildren(int numberofchildren) {
		this.numberofchildren = numberofchildren;
	}

	public String getChildages() {
		return childages;
	}

	public void setChildages(String childages) {
		this.childages = childages;
	}

	public String getRatekey() {
		return ratekey;
	}

	public void setRatekey(String ratekey) {
		this.ratekey = ratekey;
	}

	 
}
