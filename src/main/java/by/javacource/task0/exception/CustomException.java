package by.javacource.task0.exception;

public class CustomException extends Exception{

    public CustomException() {
    }


    public CustomException(String message) {
        super(message);
    }


    public CustomException(Exception e) {
        super(e);
    }
}
