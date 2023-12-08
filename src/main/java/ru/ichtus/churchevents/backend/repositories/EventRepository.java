package ru.ichtus.churchevents.backend.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import ru.ichtus.churchevents.backend.models.EventDocument;

import java.util.UUID;

public interface EventRepository extends ReactiveMongoRepository<EventDocument, UUID> {

}
