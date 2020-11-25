package co.grandcircus.group3apiproject;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import co.grandcircus.group3apiproject.model.EventResponse;

@Service
public class EventService {

	@Value("${apikey}")
	String apikey;

	private RestTemplate rt = new RestTemplate();

	public EventResponse getEventResponse(String url) {
		url = url + "&apikey=" + apikey;
		System.out.println(url);
		EventResponse res = rt.getForObject(url, EventResponse.class);
		System.out.println(res.get_embedded().getEvents().size());
		return res;
	}
}
