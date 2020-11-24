package co.grandcircus.group3apiproject.model;

import java.util.List;

public class EmbeddedResponse {

	private List<Event> events;

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "EventResponse [events=" + events + "]";
	}
	
}
