package com.websystique.springmvc.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CheckinDates {
	private LocalDate sdate;
	private int nights;

	public CheckinDates(String sdate, int nights) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");			 
		this.sdate = LocalDate.parse(sdate, formatter);
					
		this.nights = nights;
	}

	public String getCheckinDate() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");

		if (sdate == null) {

			sdate = LocalDate.now();
			sdate.plusDays(1);// next day

		}
		return sdate.format(df);

	}

	public String getCheckoutDate() {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");

		if (sdate == null) {

			sdate = LocalDate.now();
			sdate.plusDays(1);

		}

		sdate = sdate.plusDays(nights);

		return sdate.format(df);
	}

}
