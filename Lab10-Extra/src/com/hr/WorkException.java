package com.hr;


// This is a more HR oriented exception vs the other exception which is transportation oriented.
public class WorkException extends Exception {
    public WorkException() {
        super();
    }

    public WorkException(String message) {
        super(message);
    }

    public WorkException(String message, Throwable cause) {
        super(message, cause);
    }

    public WorkException(Throwable cause) {
        super(cause);
    }
}
