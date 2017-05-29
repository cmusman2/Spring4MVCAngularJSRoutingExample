package com.lowestroomrates.hotels.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Surcharges {
	private int size;
	private Surcharge[] surcharges;

	@XmlAttribute(name="size")
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@XmlElement(name="surcharge")
	public Surcharge[] getSurcharges() {
		return surcharges;
	}

	public void setSurcharges(Surcharge[] surcharges) {
		this.surcharges = surcharges;
	}
}
