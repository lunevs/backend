package ru.ichtus.churchevents.backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.ichtus.churchevents.backend.models.EventDocument;
import ru.ichtus.churchevents.backend.services.EventService;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventController {

    private final EventService eventService;

    @GetMapping
    public Flux<?> getEventsList() {
        return Flux.empty();
    }

    @PostMapping
    public Mono<EventDocument> createNewEvent() {
        return Mono.empty();
    }
}
