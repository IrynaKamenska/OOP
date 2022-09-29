package exceptions;

public class MyApplicationException extends RuntimeException{
    public MyApplicationException(String message) {
        super(message);
    }
//
//    public MyApplicationException(String message, Throwable cause) {
//      //  RuntimeException(message, cause);
//        super(message, cause);
//    }
}
