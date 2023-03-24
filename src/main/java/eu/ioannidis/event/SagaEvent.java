package eu.ioannidis.event;

import java.io.Serializable;
import java.util.UUID;

public abstract class SagaEvent<T> implements Serializable {

    private UUID id;

    private String type;

    private T data;

    public SagaEvent() {
    }

    public SagaEvent(UUID id, String type, T data) {
        this.id = id;
        this.type = type;
        this.data = data;
    }

    public UUID getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public T getData() {
        return data;
    }
}
