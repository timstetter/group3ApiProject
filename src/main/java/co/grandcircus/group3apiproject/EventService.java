package co.grandcircus.group3apiproject;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.group3apiproject.model.Event;
import co.grandcircus.group3apiproject.model.EventResponse;


@Service
public class EventService {

	private RestTemplate rt = new RestTemplate();
	
	public List<Event> getEvents(){
		String url = "https://app.ticketmaster.com/discovery/v2/events.json?apikey=XTigciauJn6eKwcA7DMAn679DJfqJZY7";
		EventResponse res = rt.getForObject(url, EventResponse.class);
		System.out.println(res);
		return res.get_embedded().getEvents();
		
		
	}
	
}
