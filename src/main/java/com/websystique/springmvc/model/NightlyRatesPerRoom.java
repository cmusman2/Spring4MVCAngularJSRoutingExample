package com.websystique.springmvc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class NightlyRatesPerRoom {
	private int size;
	private NightlyRate[] nightlyRates;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@XmlElement(name="nightlyrate")
	public NightlyRate[] getNightlyRates() {
		return nightlyRates;
	}

	
	public void setNightlyRates(NightlyRate[] nightlyRates) {
		this.nightlyRates = nightlyRates;
	}
	
	
}
