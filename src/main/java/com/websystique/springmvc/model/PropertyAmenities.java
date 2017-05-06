package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PropertyAmenities")
public class PropertyAmenities {
	private PropertyAmenity[] propertyAmenity;

	@XmlElement(name="PropertyAmenity")
	public PropertyAmenity[] getPropertyAmenity() {
		return propertyAmenity;
	}

	public void setPropertyAmenity(PropertyAmenity[] propertyAmenity) {
		this.propertyAmenity = propertyAmenity;
	}

}
