package co.grandcircus.group3apiproject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventController {
	
	@Autowired
	private EventService eventService;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("events", eventService.getEvents());
		
		return "index";
	}
}
