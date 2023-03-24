package eu.ioannidis.exception;

public class UnsupportedStateTransitionException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UnsupportedStateTransitionException(Enum<?> state) {
        super("Unsupported transition from current state: " + state);
    }
}