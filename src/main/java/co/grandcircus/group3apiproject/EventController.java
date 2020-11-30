package co.grandcircus.group3apiproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.grandcircus.group3apiproject.model.Event;
import co.grandcircus.group3apiproject.model.EventResponse;



@Controller
public class EventController {

	@Autowired
	private EventService eventService;
	
	@Autowired
	private EventRepository rep;

	@GetMapping("/")
	public String index(
			@RequestParam(defaultValue = "https://app.ticketmaster.com/discovery/v2/events.json?null=null") String url,
			Model model) {

		model.addAttribute("eRep", eventService.getEventResponse(url));

		return "index";
	}

	@PostMapping("/")
	public String results(@RequestParam String keyword, Model model) {
		model.addAttribute("keyword", keyword);
		model.addAttribute("eRep", eventService.getEventResponse(eventService.searchKeyword(keyword)));

		return "index";

	}
	
	@GetMapping("/add/{id}")
	public String add(@PathVariable("id") String id) {
		Event event = eventService.getEventById(id);
		event.setId(id);
		System.out.println(event.getName());
		System.out.println(event);
		rep.save(event);
		return "redirect:/";
		
	}
	
	
}







