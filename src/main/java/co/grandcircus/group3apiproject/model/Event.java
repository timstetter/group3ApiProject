package co.grandcircus.group3apiproject.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="event")
public class Event {

	private String name;
	@Id
	private String id;
	private String url; // direct link to promoter for event
	private String info;
	@Transient
	private StartDates dates;	
	@OneToOne
	private Embedded _embedded;
	
	public Event() {
		
	}
	
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
