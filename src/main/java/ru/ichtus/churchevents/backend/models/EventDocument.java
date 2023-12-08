package ru.ichtus.churchevents.backend.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
@Data
public class EventDocument {

    @Id
    private UUID id;

    private String title;
    private int members;
}
