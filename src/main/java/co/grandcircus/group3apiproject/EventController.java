package co.grandcircus.group3apiproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EventController {

	@Autowired
	private EventService eventService;

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
}
