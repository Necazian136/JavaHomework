package Homework.Context;

import Homework.Object.Person;

public abstract class PersonContext implements Context<Person> {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
