package Exceptions;

public class WhiteCellException extends Exception {
    public WhiteCellException() {
    }

    public WhiteCellException(String message) {
        super(message);
    }

    public WhiteCellException(String message, Throwable cause) {
        super(message, cause);
    }

    public WhiteCellException(Throwable cause) {
        super(cause);
    }

    public WhiteCellException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
