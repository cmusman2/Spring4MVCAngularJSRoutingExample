package com.websystique.springmvc.controller;

import java.io.IOException;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.websystique.springmvc.domain.HotelSearch;
import com.websystique.springmvc.model.Hotel;
import com.websystique.springmvc.model.HotelDescription;
import com.websystique.springmvc.model.HotelDetailsDescription;
import com.websystique.springmvc.model.HotelSummary;
import com.websystique.springmvc.model.HotelSummaryDetails;
import com.websystique.springmvc.model.HotelSummaryList;
import com.websystique.springmvc.model.Hotels;
import com.websystique.springmvc.service.WSServiceDaos;
 

@RestController
@RequestMapping("/item")
public class TravelController {
	
	
	
	
	@RequestMapping(value = "/hotels")
	public  ResponseEntity<Hotels> getHotels()
	{
		//logger.debug("hotels request received....");
		System.out.println("coming here");
		Hotels htls = new Hotels();
		
		Hotel h = new Hotel();
		h.setName("marriot");
		htls.getHotels().add(h);
		
		h = new Hotel();
		h.setName("holiday Inn");
		htls.getHotels().add(h);

		return new ResponseEntity<Hotels>(htls, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/hotels/{city}")
	public  ResponseEntity<List<HotelSummary>> getCityHotels(@PathVariable String city)
	{
		//logger.debug("hotels request received....");
		System.out.println("coming here now for " + city);
		
		  if (city==null || city.isEmpty()) return null;
		
		List<HotelSummary> htls =new ArrayList<HotelSummary>();;
		
		
		
		try
		{
			
			
			htls = WSServiceDaos.Hotels(city, null, 1);
		}catch(Exception exp)
		{
			
		}
		
		if (htls.size()==0)
		{
		  HotelSummary h = new HotelSummary();
		  h.setName("marriot london");
		  htls.add(h);

		  
		  h = new HotelSummary();  
		  h.setName("holidayinn london");
		  htls.add(h);
		}
		
		System.out.println("coming here now ended");
		return new ResponseEntity<List<HotelSummary>>(htls, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/hotels/details/{hotelid}")
	public  ResponseEntity<HotelDescription> getHotelDetails(@PathVariable int hotelid) throws ClientProtocolException, IOException, JAXBException, XMLStreamException
	{
		//logger.debug("hotels request received....");
		System.out.println("coming here now for details - " + hotelid);
		
		  if (hotelid==0) return null;
		
		  HotelDescription htls =WSServiceDaos.HotelDetails(hotelid);
		
		
		
		try
		{
			
			if (htls==null)
			{
			  htls = new HotelDescription();//WSServiceDaos.HotelDetails(hotelid);
			  htls.setHotelSummary(new HotelSummaryDetails());
			  htls.getHotelSummary().setName("marriott");
			}
			
		}catch(Exception exp)
		{
			
		}
		
		System.out.println("coming here now ended");
		return new ResponseEntity<HotelDescription>(htls, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/displayHotel", method = RequestMethod.GET)
	public   ModelAndView displayHotel()
	{
		/*
       Session session = ServiceDao.getSessionFactory().openSession();
		
		@SuppressWarnings("unchecked")
		List<Hotel> htls = (List<Hotel>) session.createQuery("from Hotel").list();
		Hotels hotels = new Hotels();
		hotels.setHotels(htls);
*/
	 
		
		 
		ModelAndView mv = new ModelAndView("htlList");

		//mv.addObject("htlList", hotels); 
		 


		return mv;
	}
	
	@RequestMapping(value = "/displayHotel/{name}", method = RequestMethod.GET)
	public  ModelAndView displayHotelDetail(ModelAndView mv, @PathVariable("name") String name)
	{
		/*
       Session session = ServiceDao.getSessionFactory().openSession();
		
		@SuppressWarnings("unchecked")
		List<Hotel> htls = (List<Hotel>) session.createQuery("from Hotel where name='"+name+"'").list();
		Hotels hotels = new Hotels();
		hotels.setHotels(htls);

	 
		
		 
		
        mv.setViewName("htlDetail");
		mv.addObject("htlList", hotels); 
		 */


		return mv;
	}
	
	@RequestMapping(value = "/getHotels", method = RequestMethod.GET)
	public   Hotels displayHotelsDB()
	{
		
	//	Session session = ServiceDao.getSessionFactory().openSession();
		
		@SuppressWarnings("unchecked")
	//	List<Hotel> htls = (List<Hotel>) session.createQuery("from Hotel").list();
		Hotels hotels = new Hotels();
	//	hotels.setHotels(htls);

		return hotels;
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
	public   ModelAndView hotelUpdate(ModelAndView mv, @RequestParam("id") String id)
	{		
		/*
		Session session = ServiceDao.getSessionFactory().openSession();
		
		@SuppressWarnings("unchecked")
		List<Hotel> htls = (List<Hotel>) session.createQuery("from Hotel where id="+id).list();
		
		Hotel h;
		if (htls.size()>0)
		 h =htls.get(0);
		else
			 h = new Hotel();
		
        mv.setViewName("hotelUpdate");
		mv.addObject("hotel", h); 
		*/
		return mv;

	}	 
	
	
	@RequestMapping(value = "/hotel/{id}")
	public   ModelAndView hotelDetails(ModelAndView mv, @RequestParam("id") String id)
	{		
		/*
		Session session = ServiceDao.getSessionFactory().openSession();
		
		@SuppressWarnings("unchecked")
		List<Hotel> htls = (List<Hotel>) session.createQuery("from Hotel where id="+id).list();
		
		Hotel h;
		if (htls.size()>0)
		 h =htls.get(0);
		else
			 h = new Hotel();
        mv.setViewName("htlDetail");
		mv.addObject("hotel", h); 
		*/
		return mv;

	}	
	
	@RequestMapping(value = "/searchdoorig")
	public   Hotels searchdoorig(@ModelAttribute("searchForm")  HotelSearch hotelSearch, BindingResult bindingResult)
	{				
		System.out.println("getting there");
		
		Hotels hs = new Hotels();
		 
		Hotel h= new Hotel();
		h.setName("Marriott Manchester, Downtown");
		h.setAddress1("In the city center");
		h.setRate("325.55");
		h.setThumbNail("http://images.travelnow.com/hotels/2000000/1900000/1897400/1897390/1897390_4_t.jpg");
		hs.getHotels().add(h);
		
		h= new Hotel();
		h.setName("Crown plaza City Center");
		h.setAddress1("Water front");
		h.setRate("125.80");
		h.setThumbNail("http://images.travelnow.com/hotels/1000000/900000/898700/898665/898665_117_t.jpg");
		hs.getHotels().add(h);		
		
		h= new Hotel();
		h.setName("Crown plaza City Center");
		h.setAddress1("Water front");
		h.setRate("125.80");
		h.setThumbNail("http://images.travelnow.com/hotels/1000000/900000/898700/898665/898665_117_t.jpg");
		hs.getHotels().add(h);		
		
		
		System.out.println(hotelSearch.getCityAjaxH());
        /*mv.setViewName("htlList");
		mv.addObject("htlList", hs); 
		mv.addObject("destination", hotelSearch.getCityAjaxH());*/
		return hs;

	}
		
	@RequestMapping(value = "/searchdo", method = RequestMethod.POST)
	public   ModelAndView searchdo(ModelAndView mv,@ModelAttribute("searchForm")  HotelSearch hotelSearch, BindingResult bindingResult)
	{		
		HotelSummaryList hs = new HotelSummaryList();
		List<HotelSummary> hotels=null;
		try
		{
		   hotels = WSServiceDaos.Hotels(hotelSearch.getCityAjaxH(), hotelSearch.getSDATEH(), hotelSearch.getNights());
		}catch(Exception exp)
		{
			
		}
		
		
		System.out.println(hotelSearch.getCityAjaxH());
        
		mv.setViewName("htlDisplay3");		
		mv.addObject("hotels",hotels);
		return mv;

	}
	
	
	@RequestMapping(value = "/booking/{id}")
	public   ResponseEntity<HotelDescription> booking(@PathVariable String id) throws ClientProtocolException, IOException
	{		System.out.println("booking...");

	       HotelDescription h = new HotelDescription();
                    
          return new ResponseEntity<HotelDescription>(h, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/autoComplete")
	public   String autoComplete(String q) throws ClientProtocolException, IOException
	{		
          List<String> locations = new ArrayList();
          String locationList= WSServiceDaos.getLocationData(q);
                    
          return locationList;
	}
}
