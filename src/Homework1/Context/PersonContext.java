package Homework1.Context;

import Homework1.Object.Person;

public abstract class PersonContext implements Context<Person> {
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
