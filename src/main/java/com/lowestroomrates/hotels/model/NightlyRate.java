package com.lowestroomrates.hotels.model;

import javax.xml.bind.annotation.XmlAttribute;

public class NightlyRate {
	private float baseRate;
	private float rate;
	private boolean promo;

	@XmlAttribute(name="baserate")
	public float getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(float baseRate) {
		this.baseRate = baseRate;
	}

	@XmlAttribute(name="rate")
	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	@XmlAttribute(name="promo")
	public boolean isPromo() {
		return promo;
	}

	public void setPromo(boolean promo) {
		this.promo = promo;
	}
}
