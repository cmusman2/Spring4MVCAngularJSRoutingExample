package com.websystique.springmvc.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "chargeablerateinfo")
public class ChargeableRateInfo {
	private float averagebaserate;
	private float averagerate;
	private String currencycode;
	private String currencysymbol;


	private float nightlyratetotal;
	private float surchargetotal;
	private float total;
	private boolean nonrefundable;
	private String rateType;
	private String currentallotment;
	
	private NightlyRatesPerRoom RoomnightlyRates;
	private Surcharges Roomsurcharges;
	

	
	@XmlElement
	public String getCurrencysymbol() {
		if (currencycode=="USD")
		return "$";
		else
		if (currencycode=="GPB")
		return "£";
		return "$";
	}

	public void setCurrencysymbol(String currencysymbol) {
		this.currencysymbol = currencysymbol;
	}
	
	@XmlElement(name="surcharges")
	public Surcharges getSurcharges() {
		return Roomsurcharges;
	}

	public void setSurcharges(Surcharges Roomsurcharges) {
		this.Roomsurcharges = Roomsurcharges;
	}

	@XmlElement(name="nightlyratesperroom")
	public NightlyRatesPerRoom getNightlyRates() {
		return RoomnightlyRates;
	}

	public void setNightlyRates(NightlyRatesPerRoom RoomnightlyRates) {
		this.RoomnightlyRates = RoomnightlyRates;
	}

	@XmlAttribute
	public float getAveragebaserate() {
		return averagebaserate;
	}

	public void setAveragebaserate(float averagebaserate) {
		this.averagebaserate = averagebaserate;
	}

	@XmlAttribute
	public float getAveragerate() {
		return averagerate;
	}

	public void setAveragerate(float averagerate) {
		this.averagerate = averagerate;
	}
	
	@XmlAttribute(name="currencycode")
	public String getCurrecncycode() {
		return currencycode;
	}

	public void setCurrecncycode(String currencycode) {
		this.currencycode = currencycode;
	}

	@XmlAttribute
	public float getNightlyratetotal() {
		return nightlyratetotal;
	}

	public void setNightlyratetotal(float nightlyratetotal) {
		this.nightlyratetotal = nightlyratetotal;
	}

	@XmlAttribute
	public float getSurchargetotal() {
		return surchargetotal;
	}

	public void setSurchargetotal(float surchargetotal) {
		this.surchargetotal = surchargetotal;
	}

	@XmlAttribute
	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	@XmlElement
	public boolean isNonrefundable() {
		return nonrefundable;
	}

	public void setNonrefundable(boolean nonrefundable) {
		this.nonrefundable = nonrefundable;
	}

	@XmlElement
	public String getRateType() {
		return rateType;
	}

	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	@XmlElement
	public String getCurrentallotment() {
		return currentallotment;
	}

	public void setCurrentallotment(String currentallotment) {
		this.currentallotment = currentallotment;
	}

}
