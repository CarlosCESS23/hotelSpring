package main.exception;

public class DuplicationByIdException extends RuntimeException {
    public DuplicationByIdException(String message) {
        super(message);
    }
}
