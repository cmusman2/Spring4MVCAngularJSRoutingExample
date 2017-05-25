package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlAttribute;

public class Surcharge {
	private String type;
	private float amount;

	@XmlAttribute(name="type")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlAttribute(name="amount")
	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}
