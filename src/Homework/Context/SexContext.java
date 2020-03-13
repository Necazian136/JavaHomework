package Homework.Context;

import Homework.Object.Person;

public class SexContext extends PersonContext {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        int value = 0;
        if (firstPerson.getSex().isMale() && secondPerson.getSex().isFemale()) {
            value = -1;
        }
        if (firstPerson.getSex().isFemale() && secondPerson.getSex().isMale()) {
            value = 1;
        }
        return  value;
    }
}
