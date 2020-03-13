package Homework1.Context;

import Homework1.Object.Person;

public class NameContext extends PersonContext {

    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return firstPerson.getName().compareTo(secondPerson.getName());
    }
}
