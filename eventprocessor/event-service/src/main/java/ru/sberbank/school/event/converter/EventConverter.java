package ru.sberbank.school.event.converter;

import lombok.NonNull;
import org.springframework.stereotype.Component;
import ru.sberbank.school.event.entity.Event;
import ru.sberbank.school.feign.model.EventModel;

@Component
public class EventConverter {

    public EventModel convertToModel (@NonNull Event event) {
        return EventModel.builder()
                .id(event.getId())
                .userId(event.getUserId())
                .header(event.getHeader())
                .body(event.getBody())
                .timestamp(event.getTimestamp())
                .build();
    }

    public Event convertToEntity (@NonNull EventModel event) {
        return Event.builder()
                .id(event.getId())
                .userId(event.getUserId())
                .header(event.getHeader())
                .body(event.getBody())
                .timestamp(event.getTimestamp())
                .build();
    }
}