package Exceptions;

public class InvalidArrayLengthException extends ArrayIndexOutOfBoundsException{
    public InvalidArrayLengthException(String message) {
        super(message);
    }
}
