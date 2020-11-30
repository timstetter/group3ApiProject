package co.grandcircus.group3apiproject.model;

import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name="embedded")
public class Embedded {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToMany(mappedBy="embedded", cascade=CascadeType.ALL)
	@OrderColumn
	private Venue[] venues;

	public Venue[] getVenues() {
		return venues;
	}

	public void setVenues(Venue[] venues) {
		this.venues = venues;
	}

	@Override
	public String toString() {
		return "Embedded [venues=" + Arrays.toString(venues) + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	
	
}
