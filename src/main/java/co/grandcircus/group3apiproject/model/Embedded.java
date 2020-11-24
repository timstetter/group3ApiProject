package co.grandcircus.group3apiproject.model;

import java.util.Arrays;

public class Embedded {

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


	
	
}
