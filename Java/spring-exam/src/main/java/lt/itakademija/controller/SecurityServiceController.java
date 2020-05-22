package lt.itakademija.controller;

import lt.itakademija.model.EventRegistration;
import lt.itakademija.model.RegisteredEvent;
import lt.itakademija.model.RegisteredEventUpdate;
import lt.itakademija.repository.SecurityEventsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class SecurityServiceController {

    private final SecurityEventsRepository repository;

    @Autowired
    public SecurityServiceController(final SecurityEventsRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/webapi/events")
    public ResponseEntity<List<RegisteredEvent>> getRegisteredEvents() {
        return  new ResponseEntity<>( repository.getEvents(),HttpStatus.OK);
    }

    @PostMapping("/webapi/events")
    public ResponseEntity<RegisteredEvent> createEvent( @RequestBody final @Valid EventRegistration registrationData) {
        if (registrationData==null || registrationData.getSeverityLevel()==null ) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        RegisteredEvent response = repository.create(registrationData);
        return new ResponseEntity<>(response,HttpStatus.CREATED);
    }

    @DeleteMapping("/webapi/events/{eventId}")
    public ResponseEntity<RegisteredEvent> deleteEvent(@PathVariable final Long eventId) {
        RegisteredEvent response = repository.delete(eventId);
        return new ResponseEntity<>( response,HttpStatus.OK);
    }

    @PutMapping("/webapi/events/{eventId}")
    public ResponseEntity<RegisteredEvent> updateEvent(@PathVariable final Long eventId,  @RequestBody final RegisteredEventUpdate updateData) {
        if (updateData==null || updateData.getSeverityLevel()==null) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        RegisteredEvent response = repository.update(eventId,updateData);
        return new ResponseEntity<>( response,HttpStatus.OK);
    }

}
