package Exceptions;

public class BusyCellException extends Exception {
    public BusyCellException() {
    }

    public BusyCellException(String message) {
        super(message);
    }

    public BusyCellException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusyCellException(Throwable cause) {
        super(cause);
    }

    public BusyCellException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
