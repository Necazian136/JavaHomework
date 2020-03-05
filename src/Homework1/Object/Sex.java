package Homework1.Object;

import Homework1.Exception.NotValidSexException;

public class Sex {
    public static final String MAN = "MAN";
    public static final String WOMAN = "WOMAN";

    private boolean sex;

    public Sex(String sex) throws NotValidSexException {
        if (sex.equals(MAN)) {
            this.sex = true;
        } else if (sex.equals(WOMAN)) {
            this.sex = false;
        } else {
            throw new NotValidSexException();
        }
    }

    public boolean isMale() {
        return this.sex;
    }

    public boolean isFemale() {
        return !this.sex;
    }

    @Override
    public String toString() {
        return this.sex ? MAN : WOMAN;
    }
}
