package co.grandcircus.group3apiproject.model;



public class EventResponse {

	private EmbeddedResponse _embedded;

	public EmbeddedResponse get_embedded() {
		return _embedded;
	}

	public void set_embedded(EmbeddedResponse _embedded) {
		this._embedded = _embedded;
	}

	@Override
	public String toString() {
		return "EventResponse [_embedded=" + _embedded + "]";
	}

	
	
}
