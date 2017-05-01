package com.websystique.springmvc.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.codec.Charsets;
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
import org.apache.taglibs.standard.resources.Resources;
import org.springframework.core.io.ClassPathResource;

import com.websystique.springmvc.model.HotelDescription;
import com.websystique.springmvc.model.HotelResponse;
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
	  //authenticate
	  
	  //String x = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><ns2:hotellistresponse xmlns:ns2=\"http://v3.hotel.wsapi.ean.com\"><customersessionid>0ABAAA42-487E-F915-62D2-4C6B0D9015B0</customersessionid><numberofroomsrequested>0</numberofroomsrequested><moreresultsavailable>false</moreresultsavailable><hotellist size=\"1374\" activepropertycount=\"1374\"><hotelsummary order=\"0\"><hotelid>284677</hotelid><name>Best Western Plus Delmere Hotel</name><address1>130 Sussex Gardens</address1><city>London</city><postalcode>W2 1UB</postalcode><countrycode>GB</countrycode><airportcode>LHR</airportcode><propertycategory>1</propertycategory><hotelrating>3.0</hotelrating><confidencerating>94</confidencerating><amenitymask>0</amenitymask><tripadvisorrating>4.0</tripadvisorrating><tripadvisorreviewcount>139</tripadvisorreviewcount><tripadvisorratingurl>http://www.tripadvisor.com/img/cdsi/img2/ratings/traveler/4.0-16366-4.gif</tripadvisorratingurl><locationdescription>Near Marble Arch</locationdescription><shortdescription>&amp;lt;p&amp;gt;&amp;lt;b&amp;gt;Property Location&amp;lt;/b&amp;gt; &amp;lt;br /&amp;gt;With a stay at Best Western Plus Delmere Hotel in London (Paddington), you&amp;apos;ll be convenient to Hyde Park Speakers&amp;apos; Corner and Selfridges.  This hotel is close to</shortdescription><highrate>284.29</highrate><lowrate>163.91</lowrate><ratecurrencycode>USD</ratecurrencycode><latitude>51.51563</latitude><longitude>-0.17226</longitude><proximitydistance>3.075692</proximitydistance><proximityunit>MI</proximityunit><hotelindestination>true</hotelindestination><thumbnailurl>/hotels/1000000/30000/21700/21632/21632_126_t.jpg</thumbnailurl><deeplink>http://www.travelnow.com/templates/396041/hotels/284677/overview?lang=en&amp;amp;currency=USD&amp;amp;standardCheckin=null/null/null&amp;amp;standardCheckout=6/7/2018</deeplink></hotelsummary></hotellist></ns2:hotellistresponse>";
	  //String x = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><ns2:hotellistresponse xmlns:ns2=\"http://v3.hotel.wsapi.ean.com\"><customersessionid>0ABAAA42-487E-F915-62D2-4C6B0D9015B0</customersessionid><numberofroomsrequested>0</numberofroomsrequested><moreresultsavailable>false</moreresultsavailable><hotellist size=\"1374\" activepropertycount=\"1374\"><hotelsummary order=\"0\"><hotelid>284677</hotelid><name>Best Western Plus Delmere Hotel</name><address1>130 Sussex Gardens</address1><city>London</city><postalcode>W2 1UB</postalcode><countrycode>GB</countrycode><airportcode>LHR</airportcode><propertycategory>1</propertycategory><hotelrating>3.0</hotelrating><confidencerating>94</confidencerating><amenitymask>0</amenitymask><tripadvisorrating>4.0</tripadvisorrating><tripadvisorreviewcount>139</tripadvisorreviewcount><tripadvisorratingurl>http://www.tripadvisor.com/img/cdsi/img2/ratings/traveler/4.0-16366-4.gif</tripadvisorratingurl><locationdescription>Near Marble Arch</locationdescription><shortdescription>&amp;lt;p&amp;gt;&amp;lt;b&amp;gt;Property Location&amp;lt;/b&amp;gt; &amp;lt;br /&amp;gt;With a stay at Best Western Plus Delmere Hotel in London (Paddington), you&amp;apos;ll be convenient to Hyde Park Speakers&amp;apos; Corner and Selfridges.  This hotel is close to</shortdescription><highrate>284.29</highrate><lowrate>163.91</lowrate><ratecurrencycode>USD</ratecurrencycode><latitude>51.51563</latitude><longitude>-0.17226</longitude><proximitydistance>3.075692</proximitydistance><proximityunit>MI</proximityunit><hotelindestination>true</hotelindestination><thumbnailurl>/hotels/1000000/30000/21700/21632/21632_126_t.jpg</thumbnailurl><deeplink>http://www.travelnow.com/templates/396041/hotels/284677/overview?lang=en&amp;amp;currency=USD&amp;amp;standardCheckin=null/null/null&amp;amp;standardCheckout=6/7/2018</deeplink></hotelsummary></hotellist></ns2:hotellistresponse>";
try
{
	
	//x = getHotelListData(city,sd,nights);
	
	//System.out.println(x);
	
	String xml= "";
	try
	{
		ClassLoader classLoader = new WSServiceDaos().getClass().getClassLoader();
		File file = new File(classLoader.getResource("hotelList.data").getFile());
		 
		List<String> data = Files.readAllLines(file.toPath());
	    for(String s:data)
		xml+=s;
	    
		System.out.println(xml);

	}catch(Exception exp)
	{
		System.out.println(exp.getMessage());
		exp.printStackTrace();
	}
	
	if (xml=="") return null;
	StringReader sr = new StringReader(xml);
      
	   
	
	  
	  JAXBContext jc = JAXBContext.newInstance(HotelResponse.class);
      Unmarshaller unmarshaller = jc.createUnmarshaller();
      HotelResponse hotelResponse = (HotelResponse)JAXBIntrospector.getValue( unmarshaller.unmarshal(sr));
      if(hotelResponse!=null && hotelResponse.getHotelList()!=null)
      return hotelResponse.getHotelList().getHotelSummaries();
      
      sr.close();
}catch(Exception exp)
{
	String ss = exp.getMessage();
	System.out.println(ss);
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
			    
				System.out.println(data.toString());
 
			}catch(Exception exp)
			{
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}
			
			//xml=getData(postData);
			
			if (xml=="") return null;
			
			System.out.println(xml);
			StringReader sr = new StringReader(xml);
			 JAXBContext jc = JAXBContext.newInstance(HotelDescription.class);
		      Unmarshaller unmarshaller = jc.createUnmarshaller();
		      HotelDescription hotelDescription = (HotelDescription)JAXBIntrospector.getValue( unmarshaller.unmarshal(sr));
		          
		      if(hotelDescription!=null)
		      System.out.println(hotelDescription.toString());
		      else
		    	  System.out.println("not decoded");
		      
		      if(hotelDescription!=null)
		      return hotelDescription;//return hotelResponse.getHotelList().getHotelSummaries();
		  
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
}
