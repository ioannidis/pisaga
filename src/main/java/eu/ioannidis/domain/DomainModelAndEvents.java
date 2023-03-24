package eu.ioannidis.domain;


import eu.ioannidis.event.SagaEvent;

import java.util.Arrays;
import java.util.List;

public class DomainModelAndEvents<A, E extends SagaEvent<?>> {

    private final A model;
    private final List<E> events;

    public DomainModelAndEvents(A model, List<E> events) {
        this.model = model;
        this.events = events;
    }

    public DomainModelAndEvents(A model, E... events) {
        this.model = model;
        this.events = Arrays.asList(events);
    }

    public A getModel() {
        return model;
    }

    public List<E> getEvents() {
        return events;
    }
}
