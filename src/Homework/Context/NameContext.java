package Homework.Context;

import Homework.Object.Person;

public class NameContext extends PersonContext {

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getName().compareTo(secondPerson.getName());
    }
}
