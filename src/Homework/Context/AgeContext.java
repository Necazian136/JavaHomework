package Homework.Context;

import Homework.Object.Person;

public class AgeContext extends PersonContext {
    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        return secondPerson.getAge() - firstPerson.getAge();
    }
}
