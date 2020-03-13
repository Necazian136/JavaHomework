package Homework.Exception;

public class PetAlreadyExistsException extends Exception {
    public PetAlreadyExistsException() {
    }

    public String getMessage() {
        return "Такой питомец уже существует";
    }
}
