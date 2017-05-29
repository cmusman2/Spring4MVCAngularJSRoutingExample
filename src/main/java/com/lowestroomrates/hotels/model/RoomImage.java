package com.lowestroomrates.hotels.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="roomimage")
public class RoomImage {

	private String url;
	private String highresolutionurl;
	private String caption;
	
	@XmlElement(name="highresolutionurl")
	public String getHighresolutionurl() {
		return highresolutionurl;
	}

	public void setHighresolutionurl(String highresolutionurl) {
		this.highresolutionurl = highresolutionurl;
	}

	@XmlElement(name="url")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@XmlElement(name="caption")
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
}
