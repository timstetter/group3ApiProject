package co.grandcircus.group3apiproject;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.group3apiproject.model.Event;

public interface EventRepository extends JpaRepository<Event, String> {

}
