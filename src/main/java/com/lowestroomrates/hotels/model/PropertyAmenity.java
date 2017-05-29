package com.lowestroomrates.hotels.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PropertyAmenity")
public class PropertyAmenity {
	private String amenityId;
	private String amenity;

	public String getAmenityId() {
		return amenityId;
	}

	public void setAmenityId(String amenityId) {
		this.amenityId = amenityId;
	}

	public String getAmenity() {
		return amenity;
	}

	public void setAmenity(String amenity) {
		this.amenity = amenity;
	}
}
