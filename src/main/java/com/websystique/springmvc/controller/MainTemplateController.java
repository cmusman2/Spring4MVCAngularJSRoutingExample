package com.websystique.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class MainTemplateController {
	
    @RequestMapping(value="/computers")
    public String getComputersTemplate() {
    	return "template/item_computers";	
    }

    @RequestMapping(value="/phones")
    public String getPhonesTemplate() {
    	return "template/item_phones";	
    }

    @RequestMapping(value="/printers")
    public String getPrintersTemplate() {
    	return "template/item_printers";	
    }

    @RequestMapping(value="/computerdetails")
    public String getComputerDetailsTemplate() {
    	return "template/item_computer_details";	
    }

    @RequestMapping(value="/phonedetails")
    public String getPhoneDetailsTemplate() {
    	return "template/item_phone_details";	
    }

    @RequestMapping(value="/printerdetails")
    public String getPrinterDetailsTemplate() {
    	return "template/item_printer_details";	
    }
    
    @RequestMapping(value="/hotels")
    public String getHtlListTemplate() {
    	return "template/item_hotels";	
    }
    
    @RequestMapping(value="/cityhotels")
    public String getCityHtlsTemplate() {
    	return "template/item_cityhotels";	
    }
    
    @RequestMapping(value="/hoteldetails")
    public String getHotelDetailsTemplate() {
    	return "template/item_hoteldetails";	
    }
    
    @RequestMapping(value="/autoComplete")
    public String autoComplete() { 
    	return "";	
    }
    
}

