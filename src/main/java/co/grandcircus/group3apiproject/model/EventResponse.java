package co.grandcircus.group3apiproject.model;



public class EventResponse {

	private EmbeddedResponse _embedded;
	private Link _links;
	private PageCounter page;

	public EmbeddedResponse get_embedded() {
		return _embedded;
	}

	public void set_embedded(EmbeddedResponse _embedded) {
		this._embedded = _embedded;
	}	
	
	public Link get_links() {
		return _links;
	}

	public void set_links(Link _links) {
		this._links = _links;
	}

	public PageCounter getPage() {
		return page;
	}

	public void setPage(PageCounter page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "EventResponse [_embedded=" + _embedded + ", _links=" + _links + ", page=" + page + "]";
	}

	

	
	

	
	
}
