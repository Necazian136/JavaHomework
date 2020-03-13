package Homework.Context;

import Homework.Object.Pet;

public class PetContext implements Context<Pet> {
    @Override
    public int compare(Pet first, Pet second) {
        int result = first.getOwner().getName().compareTo(second.getOwner().getName());
        if (result == 0) {
            result = first.getName().compareTo(second.getName());
        }
        if (result == 0) {
            result = first.getWeight().compareTo(second.getWeight());
        }
        return result;
    }
}
