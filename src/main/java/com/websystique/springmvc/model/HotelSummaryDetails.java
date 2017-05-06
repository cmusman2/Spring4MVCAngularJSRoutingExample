package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlElement;

public class HotelSummaryDetails {

	 private String name;
     private String address1;
     private String address2;
     private String city;
     private String hotelRating;
     private String propertyCategory; 
     private String postalCode;
     private String countryCode;
     private String tripAdvisorRatingUrl;
     private String tripAdvisorRating;
     private String latitude;
     private String longitude;
     private String proximitydistance;
     private String proximityunit;
     private String ratecurrencycode;     
     private String lowRate;
     private String locationDescription;
     private String propertyDescription;

     @XmlElement
     public String getLocationDescription() {
		return locationDescription;
	}


	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}

	@XmlElement
	public String getPropertyDescription() {
		return propertyDescription;
	}


	public void setPropertyDescription(String propertyDescription) {
		this.propertyDescription = propertyDescription;
	}

     
     
     @XmlElement
     public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@XmlElement
	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@XmlElement
	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	@XmlElement
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	@XmlElement(name="hotelrating")
	public String getHotelRating() {
		return hotelRating;
	}


	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}

	@XmlElement(name="propertycategory")
	public String getPropertyCategory() {
		return propertyCategory;
	}


	public void setPropertyCategory(String propertyCategory) {
		this.propertyCategory = propertyCategory;
	}

	@XmlElement(name="postalcode")
	public String getPostalCoCde() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@XmlElement(name="countrycode")
	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@XmlElement(name="tripadvisorratingurl")
	public String getTripAdvisorRatingUrl() {
		return tripAdvisorRatingUrl;
	}


	public void setTripAdvisorRatingUrl(String tripAdvisorRatingUrl) {
		this.tripAdvisorRatingUrl = tripAdvisorRatingUrl;
	}

	@XmlElement(name="tripadvisorrating")
	public String getTripAdvisorRating() {
		return tripAdvisorRating;
	}


	public void setTripAdvisorRating(String tripAdvisorRating) {
		this.tripAdvisorRating = tripAdvisorRating;
	}

	@XmlElement
	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@XmlElement
	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@XmlElement
	public String getProximitydistance() {
		return proximitydistance;
	}


	public void setProximitydistance(String proximitydistance) {
		this.proximitydistance = proximitydistance;
	}

	@XmlElement
	public String getProximityunit() {
		return proximityunit;
	}


	public void setProximityunit(String proximityunit) {
		this.proximityunit = proximityunit;
	}

	@XmlElement
	public String getRatecurrencycode() {
		return ratecurrencycode;
	}


	public void setRatecurrencycode(String ratecurrencycode) {
		this.ratecurrencycode = ratecurrencycode;
	}

	@XmlElement(name="lowrate")
	public String getLowRate() {
		return getCurrencySymbol(ratecurrencycode)+"" +lowRate;
	}


	public void setLowRate(String lowRate) {
		this.lowRate = lowRate;
	}




     private String getCurrencySymbol(String cc)
     {
         if (cc == "USD") return "$";
         else
             if (cc == "EUR") return "€";
         else
             if (cc == "GBP") return "£";
         else
             return cc;


     }
}
