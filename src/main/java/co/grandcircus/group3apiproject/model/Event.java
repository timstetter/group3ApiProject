package co.grandcircus.group3apiproject.model;

public class Event {

	private String name;
	private String id;
	private String url; // direct link to promoter for event
	private String info;
	private StartDates dates;
	
	
	private Embedded _embedded;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
	public Embedded get_embedded() {
		return _embedded;
	}
	public void set_embedded(Embedded _embedded) {
		this._embedded = _embedded;
	}
	public StartDates getDates() {
		return dates;
	}
	public void setDates(StartDates dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "Event [name=" + name + ", id=" + id + ", url=" + url + ", info=" + info + ", dates=" + dates
				+ ", _embedded=" + _embedded + "]";
	}

	
	
	
	
}
