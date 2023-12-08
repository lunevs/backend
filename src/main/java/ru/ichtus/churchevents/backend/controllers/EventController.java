package ru.ichtus.churchevents.backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.ichtus.churchevents.backend.models.EventDocument;
import ru.ichtus.churchevents.backend.services.EventService;

import java.util.UUID;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Flux<?> getEventsList() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<EventDocument> getEventById(@PathVariable UUID id) {
        return eventService.getEventById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewEvent(@RequestBody EventDocument eventDocument) {
        eventService.addNewEvent(eventDocument);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<EventDocument> updateEvent(@RequestBody EventDocument eventDocument) {
        return eventService.updateEvent(eventDocument);
    }

}
