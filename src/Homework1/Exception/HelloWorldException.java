package Homework1.Exception;

public class HelloWorldException extends Exception {
    @Override
    public String getMessage() {
        return "Hello App.Exception" + super.getMessage();
    }
}
