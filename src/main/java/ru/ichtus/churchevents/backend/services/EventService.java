package ru.ichtus.churchevents.backend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.ichtus.churchevents.backend.models.EventDocument;
import ru.ichtus.churchevents.backend.repositories.EventRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public Flux<EventDocument> getAllEvents() {
        return eventRepository.findAll();
    }

    public Mono<EventDocument> addNewEvent(EventDocument eventDocument) {
        return eventRepository.save(eventDocument);
    }

    public Mono<EventDocument> getEventById(UUID uuid) {
        return eventRepository.findById(uuid);
    }
}
