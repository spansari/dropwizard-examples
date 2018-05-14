package com.sanijv.dp.examples.core;

import com.sanijv.dp.examples.api.Event;

import java.util.List;
import java.util.Optional;

public interface EventRepository {

    List<Event> findAll();

    Optional<Event> findById(Long id);

    Event save(Event event);

    Optional<Event> update(Long id, Event event);

    void delete(Long id);

}
