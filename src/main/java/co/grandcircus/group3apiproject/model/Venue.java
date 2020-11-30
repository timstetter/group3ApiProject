package co.grandcircus.group3apiproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="venue")
public class Venue {

	private String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long venueId;
	private String id;
	private String url;
	private String postalCode;
	@ManyToOne
	private Embedded embedded;
	@Transient
	private State state;
	@Transient
	private City city;
	
	
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Venue [name=" + name + ", id=" + id + ", url=" + url + ", postalCode=" + postalCode + ", state=" + state
				+ ", city=" + city + "]";
	}
	public Long getVenueId() {
		return venueId;
	}
	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}
	public Embedded getEmbedded() {
		return embedded;
	}
	public void setEmbedded(Embedded embedded) {
		this.embedded = embedded;
	}
	
	
	
}
