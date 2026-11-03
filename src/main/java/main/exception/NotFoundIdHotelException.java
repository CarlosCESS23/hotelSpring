package main.exception;

public class NotFoundIdHotelException extends RuntimeException {
    public NotFoundIdHotelException(String message) {
        super(message);
    }
}
