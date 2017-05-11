package com.websystique.springmvc.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import com.websystique.springmvc.model.HotelDescription;
import com.websystique.springmvc.model.HotelResponse;
import com.websystique.springmvc.model.HotelRoomAvailInfo;
import com.websystique.springmvc.model.HotelRoomAvailabilityResponse;
import com.websystique.springmvc.model.HotelRoomDetails;
import com.websystique.springmvc.model.HotelRoomResponse;
import com.websystique.springmvc.model.HotelRooms;
import com.websystique.springmvc.model.HotelSummary;


public class WSServiceDaos {
	
	private static String baseUrl="http://www.lowestroomrates.com";
	
  public static List<HotelSummary> Hotels(String city, Date sd, Date ed)
  {
	  //authenticate
	  
	  
	  //get data
	  return null;
  }
  
  public static List<HotelSummary> Hotels(String city, LocalDate sd, int nights) throws ClientProtocolException, IOException, JAXBException, XMLStreamException
  {
	 try
	 {
	String xml= "";
	
	
	//System.out.println(x);
	
	
	try
	{
		ClassLoader classLoader = new WSServiceDaos().getClass().getClassLoader();
		File file = new File(classLoader.getResource("hotelList.data").getFile());
		 
		List<String> data = Files.readAllLines(file.toPath());
	    for(String s:data)
		xml+=s;	    	

	}catch(Exception exp)
	{
		System.out.println(exp.getMessage());
		exp.printStackTrace();
	} 
	
    xml = getHotelListData(city, sd, nights);
	System.out.println(xml);
	if (xml=="") return null;
	
	
	  HotelResponse hotelResponse = Deserialise(HotelResponse.class, xml);
      
      if(hotelResponse!=null && hotelResponse.getHotelList()!=null)
      return hotelResponse.getHotelList().getHotelSummaries();
      
       
	 }catch(Exception exp)
{
	String ss = exp.getMessage();
	exp.printStackTrace();
}
	  
	  /*
	  */
		List<HotelSummary> hs = new ArrayList();
		
		HotelSummary h= new HotelSummary();
		h.setHotelid(1);
		h.setName("Marriott Manchester, Downtown");
		h.setAddress1("In the city center");
		h.setLowrate("325.55");
		h.setThumbnailurl("/hotels/2000000/1900000/1897400/1897390/1897390_4_l.jpg");
		hs.add(h);
		
		h= new HotelSummary();
		h.setHotelid(2);
		h.setName("Crown plaza City Center");
		h.setAddress1("Water front");
		h.setLowrate("125.80");
		h.setThumbnailurl("/hotels/1000000/900000/898700/898665/898665_117_l.jpg");
		hs.add(h);		
		
		h= new HotelSummary();
		h.setHotelid(3);
		h.setName("Crown plaza City Center");
		h.setAddress1("Water front");
		h.setLowrate("125.80");
		h.setThumbnailurl("/hotels/1000000/900000/898700/898665/898665_117_l.jpg");
		hs.add(h);	
	  
		h= new HotelSummary();
		h.setHotelid(4);
		h.setName("Crown plaza City Center");
		h.setAddress1("Water front");
		h.setLowrate("125.80");
		h.setThumbnailurl("/hotels/1000000/900000/898700/898665/898665_117_l.jpg");
		hs.add(h);	


		h= new HotelSummary();
		h.setHotelid(5);
		h.setName("Crown plaza City Center");
		h.setAddress1("Water front");
		h.setLowrate("125.80");
		h.setThumbnailurl("/hotels/1000000/900000/898700/898665/898665_117_l.jpg");
		hs.add(h);	
		
		//get data
	  return hs;
  }
  
  
  public static HotelDescription HotelDetails(int hotelIdent) throws ClientProtocolException, IOException, JAXBException, XMLStreamException
  {
	  //authenticate
	  
	  String result = authenticate();
	  if(result.length()>0)
	  {
		  HttpPost postData = new HttpPost(baseUrl+"/src/htllistDetail.php");		  
		  
		  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
		  GregorianCalendar cal = new GregorianCalendar();
		  		  
		  
		  List<NameValuePair> urlParametersData = new ArrayList<NameValuePair>();
		  urlParametersData.add(new BasicNameValuePair("xuid", result.toString()));
		  urlParametersData.add(new BasicNameValuePair("yzid0x", result.toString()));
		  String shid= String.valueOf(hotelIdent);
		  urlParametersData.add(new BasicNameValuePair("hotelId", shid));
		
			postData.setEntity(new UrlEncodedFormEntity(urlParametersData));
			String xml= "";
			
			 
			try
			{
				ClassLoader classLoader = new WSServiceDaos().getClass().getClassLoader();
				File file = new File(classLoader.getResource("hotelDetails.data").getFile());
				 
				List<String> data = Files.readAllLines(file.toPath());
			    for(String s:data)
				xml+=s;
			    
				System.out.println(xml);
 
			}catch(Exception exp)
			{
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			} 
			
			xml=getData(postData);
			if (xml=="") return null;
			
			  System.out.println(xml);
			  
			  HotelDescription hotelDescription  = Deserialise(HotelDescription.class, xml);
		      if(hotelDescription!=null)
		      {
		    	   
		         System.out.println(hotelDescription.toString());
		         HotelRoomAvailabilityResponse rooms = HotelRoomAvailability(hotelIdent);
		         
		         HotelRooms hrs = hotelDescription.getHotelRooms();
		         for(HotelRoomAvailInfo roomInfo : rooms.getHotelRooms())
		         {
		            for(HotelRoomDetails h :hrs.getHotelRoomDetails())
		            {
		            	String roomCode=h.getRoomCode();
		            	String roomTypeId = h.getRoomTypeId();

		            	String roomTypeCode=roomInfo.getRoomtypecode();
		            	String rateCode = roomInfo.getRatecode();
		            	
		        	    if( /*rateCode.equals(roomTypeId) &&*/ roomCode.equals(roomTypeCode))
		        	    {
		        	    	roomInfo.setDescriptionLong(h.getDescriptionLong()); 		        	    	
		        	    	break;
		        	    }
		            }
		            
		         }
		                 //ratecode=204167857
		        		 //roomtypecode=200826820

		         
		         List<HotelRoomAvailInfo> rs=rooms.getHotelRooms();
		         
		        	 hotelDescription.setRoomrates(rs);
		           
		         
		      }
		      else
		    	  System.out.println("not decoded");
		      
		      if(hotelDescription!=null)
		      return hotelDescription;//return hotelResponse.getHotelList().getHotelSummaries();
		  
	  }
	   
   		 
	  return null;
  }
  
  
  public static HotelRoomAvailabilityResponse HotelRoomAvailability(int hotelIdent) throws ClientProtocolException, IOException, JAXBException, XMLStreamException
  {
	  //authenticate
	  
	  String result = authenticate();
	  if(result.length()>0)
	  {
		  HttpPost postData = new HttpPost(baseUrl+"/src/Roomratesnew.php");		  
		  
		  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
		  GregorianCalendar cal = new GregorianCalendar();
		  		  
		  
		  List<NameValuePair> urlParametersData = new ArrayList<NameValuePair>();
		  urlParametersData.add(new BasicNameValuePair("xuid", result.toString()));
		  urlParametersData.add(new BasicNameValuePair("yzid0x", result.toString()));
		  String shid= String.valueOf(hotelIdent);
		  urlParametersData.add(new BasicNameValuePair("hotelId", shid));
		
			postData.setEntity(new UrlEncodedFormEntity(urlParametersData));
			String xml= "";
			
			  
			try
			{
				ClassLoader classLoader = new WSServiceDaos().getClass().getClassLoader();
				File file = new File(classLoader.getResource("roomAvailability.data").getFile());
				 
				List<String> data = Files.readAllLines(file.toPath());
			    for(String s:data)
				xml+=s;
			    
				System.out.println(data.toString());
 
			}catch(Exception exp)
			{
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}  
			
			xml=getData(postData);
			
			if (xml=="") return null;
			
			  System.out.println(xml);
			  
			  HotelRoomAvailabilityResponse roomAvailability  = Deserialise(HotelRoomAvailabilityResponse.class, xml);
		      if(roomAvailability!=null)
		      System.out.println(roomAvailability.toString());
		      else
		    	  System.out.println("not decoded");
		      
		      if(roomAvailability!=null)
		      return roomAvailability;//return hotelResponse.getHotelList().getHotelSummaries();
		  
	  }
	   
   		 
	  return null;
  }
  
  
  public static String getHotelListData(String city, LocalDate sd, int nights) throws ClientProtocolException, IOException
  {
	 
	  String result = authenticate();
	  
	  if(result.length()>0)
	  {
		  HttpPost postData = new HttpPost(baseUrl+"/src/htllist.php");		  
		  
		  DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy");
		  GregorianCalendar cal = new GregorianCalendar();
		  if (sd==null)
			  {
			     
			    sd = LocalDate.now();
				 sd.plusDays(1);
				
			  }
		    String s=sd.format(df);
		  
		  
		    sd=sd.plusDays(nights);
			
			String e= sd.format(df);		  
		  
		  List<NameValuePair> urlParametersData = new ArrayList<NameValuePair>();
		  urlParametersData.add(new BasicNameValuePair("xuid", result.toString()));
		  urlParametersData.add(new BasicNameValuePair("yzid0x", result.toString()));
		  
		  urlParametersData.add(new BasicNameValuePair("CityAjaxH", city));
		  urlParametersData.add(new BasicNameValuePair("SDATEH", s));
		  urlParametersData.add(new BasicNameValuePair("EDATEH", e));
		  urlParametersData.add(new BasicNameValuePair("maxnum", "15"));

			postData.setEntity(new UrlEncodedFormEntity(urlParametersData));

			return getData(postData);
		  
	  }
	  return "";
	  
  }
  
  
  private static String getData(HttpPost request) throws IOException
  {	  
	  HttpClient client = HttpClientBuilder.create().build();
	  HttpResponse response = client.execute(request);
	  BufferedReader rd = new BufferedReader(
		        new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}	
	  
	  return result.toString();
  }
  
  private static String authenticate() throws ClientProtocolException, IOException
  {	  

	  HttpPost post = new HttpPost(baseUrl+"/src/authenticate.php");
	  
	  List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
	  urlParameters.add(new BasicNameValuePair("sign", "tak12e"));
	  urlParameters.add(new BasicNameValuePair("pin", "vS0GKOzRwyZBSJX8gO2bHH4XVYhv-bNi2Eyuf4ZhvHs1uXmTq"));
	  post.setEntity(new UrlEncodedFormEntity(urlParameters));
	  

	  return getData(post);
	  //return "auth";
  }
  
  public static String getLocationData(String q) throws ClientProtocolException, IOException
  {
	  

	  HttpClient client = HttpClientBuilder.create().build();
	  
	  List<NameValuePair> urlParametersData = new ArrayList<NameValuePair>();
	  urlParametersData.add(new BasicNameValuePair("q", q));
	  String paramString = URLEncodedUtils.format(urlParametersData, "utf-8");

	  
	  HttpGet get = new HttpGet(baseUrl+"/src/autocomplete.php?"+paramString);
	  HttpResponse response = client.execute(get);
	  
	  BufferedReader rd = new BufferedReader(
		        new InputStreamReader(response.getEntity().getContent()));

		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line+"\n");
		}	  
		
	  if(result.length()>0)
	  {
		 return result.toString();
		  
	  }
	  return "";
	  
  }
  
  private static <T>T Deserialise(Class<T> type, String xml) throws XMLStreamException, JAXBException
  {
	  StringReader sr = new StringReader(xml);
		
	   
		 XMLInputFactory xif = XMLInputFactory.newInstance();
		 XMLStreamReader xsr = xif.createXMLStreamReader(sr);
		 xsr = new MyStreamReaderDelegate(xsr);
		   
		 
		  JAXBContext jc = JAXBContext.newInstance(type);
	      Unmarshaller unmarshaller = jc.createUnmarshaller();
	      T deSer = (T)JAXBIntrospector.getValue( unmarshaller.unmarshal(xsr));
	      xsr.close();
	      
	  return deSer;
  }
  
  
  private static class MyStreamReaderDelegate extends StreamReaderDelegate {

      public MyStreamReaderDelegate(XMLStreamReader xsr) {
          super(xsr);
      }

      @Override
      public String getAttributeLocalName(int index) {
          return super.getAttributeLocalName(index).toLowerCase().intern();
      }

      @Override
      public String getLocalName() {
          return super.getLocalName().toLowerCase().intern();
      }

  }
  
  
 
}
