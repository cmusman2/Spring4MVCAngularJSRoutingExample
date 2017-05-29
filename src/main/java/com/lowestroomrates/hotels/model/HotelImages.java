package com.lowestroomrates.hotels.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="hotelimages")
public class HotelImages {
	
	public List<HotelImage> Images;

	@XmlElement(name = "hotelimage")
	public List<HotelImage> getImages() {
		return Images;
	}

	public void setImages(List<HotelImage> images) {
		Images = images;
	}
}
