package com.websystique.springmvc.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class HotelImages {
	@XmlElement(name = "HotelImage")
	public List<HotelImage> Images;
}
