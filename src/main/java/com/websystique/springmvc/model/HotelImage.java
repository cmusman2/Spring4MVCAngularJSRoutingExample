package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class HotelImage {
	private int category;
	private int type;
	private float width;
	private float height;
	private String url;
	private String thumbnailUrl;
	private String caption;
	
 


	@XmlElement
	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
	@XmlElement
	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	@XmlElement
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	@XmlElement
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	@XmlElement
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	@XmlElement(name="thumbnailurl")
	public String getThumbnailUrl() {
		return thumbnailUrl;
	}

	public void setThumbnailUrl(String thumbnailUrl) {
		this.thumbnailUrl = thumbnailUrl;
	}
	@XmlElement
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
}
