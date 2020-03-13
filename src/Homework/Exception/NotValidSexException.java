package Homework.Exception;

public class NotValidSexException extends Exception {
    @Override
    public String getMessage() {
        return "Такого пола не существует";
    }
}
