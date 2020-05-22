package lt.itakademija.repository;

import lt.itakademija.model.EventRegistration;
import lt.itakademija.model.RegisteredEvent;
import lt.itakademija.model.RegisteredEventUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * In-memory security events repository. Internally, it uses {@link SequenceNumberGenerator} and {@link DateProvider}.
 *
 */
@Service
public final class InMemorySecurityEventsRepository implements SecurityEventsRepository {

    private List<RegisteredEvent> registeredEventList = new ArrayList<>();

    private final SequenceNumberGenerator sequenceGenerator;

    private final DateProvider dateProvider;

    @Autowired
    public InMemorySecurityEventsRepository(SequenceNumberGenerator sequenceGenerator, DateProvider dateProvider) {
        this.sequenceGenerator = sequenceGenerator;
        this.dateProvider = dateProvider;
    }

    /*
     *  Notes for implementation:
     *  
     *  This method must use SequenceNumberGenerator#getNext() for generating ID;
     *  This method must use DateProvider#getCurrentDate() for getting dates;
     */
    @Override
    public RegisteredEvent create(EventRegistration eventRegistration) {
        RegisteredEvent event = new RegisteredEvent(
                sequenceGenerator.getNext(),
                dateProvider.getCurrentDate(),
                eventRegistration.getSeverityLevel(),
                eventRegistration.getLocation(),
                eventRegistration.getDescription()
        );
        registeredEventList.add(event);
        return event;

    }

    @Override
    public List<RegisteredEvent> getEvents() {
        return registeredEventList;
    }

    @Override
    public RegisteredEvent delete(Long id) {
        RegisteredEvent event = registeredEventList.stream()
                .filter(registeredEvent -> registeredEvent.getId()==id)
                .findFirst().get();
        registeredEventList.remove(event);
        return event;
    }

    @Override
    public RegisteredEvent update(Long id, RegisteredEventUpdate registeredEventUpdate) {
        RegisteredEvent oldEvent = registeredEventList.stream()
                .filter(registeredEvent -> registeredEvent.getId()==id)
                .findFirst().get();
        RegisteredEvent newEvent = new RegisteredEvent(
                id,
                oldEvent.getRegistrationDate(),
                registeredEventUpdate.getSeverityLevel(),
                oldEvent.getLocation(),
                oldEvent.getDescription()
        );
        registeredEventList.remove(oldEvent);
        registeredEventList.add(newEvent);
        return newEvent;
    }

}
