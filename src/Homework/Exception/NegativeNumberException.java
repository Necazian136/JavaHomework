package Homework.Exception;

public class NegativeNumberException extends Exception {

    @Override
    public String getMessage() {
        return "Число не может быть меньше 0";
    }
}
