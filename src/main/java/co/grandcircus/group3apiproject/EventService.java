package co.grandcircus.group3apiproject;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.group3apiproject.model.Event;
import co.grandcircus.group3apiproject.model.EventResponse;

@Service
public class EventService {

	@Value("${apikey}")
	String apikey;

	private RestTemplate rt = new RestTemplate();    
	
	public EventResponse getEventResponse(String url) {
		url = url + "&apikey=" + apikey;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp + "|" + url);
		EventResponse res = rt.getForObject(url, EventResponse.class);
		
		return res;
	}
	
	public String searchKeyword(String keyword) {
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?keyword=";
		url = url + keyword;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		System.out.println(timestamp + "|" + url);
		
		
		return url;
	}	

	public Event getEventById(String id) {
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?id=";
		url = url + id + "&apikey=" + apikey;
		System.out.println(url);
		return rt.getForObject(url, EventResponse.class).get_embedded().getEvents().get(0);
		
		
	}


}
