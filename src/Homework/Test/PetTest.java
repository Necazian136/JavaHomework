package Homework.Test;

import Homework.Collection.PetCollection;
import Homework.Exception.NotValidSexException;
import Homework.Object.Person;
import Homework.Object.Pet;
import Homework.Object.Sex;
import org.junit.Test;

public class PetTest {
    public PetTest() {
    }

    @Test
    public void test() {
        PetCollection pets = new PetCollection();

        try {
            Person katia = new Person("Katia", 21, new Sex("WOMAN"));
            pets.add(new Pet("Ivan", new Person("Yuri", 21, new Sex("MAN")), 87.4F));
            pets.add(new Pet("Dodo", katia, 50.3F));
            pets.add(new Pet("Lolo", katia, 50.3F));
            pets.add(new Pet("Dodo", katia, 50.3F));
            pets.add(new Pet("Kolya", new Person("Kolya", 24, new Sex("MAN")), 56.3F));
            pets.changePetById(3, 40.3F);
            pets.printPets();
        } catch (NotValidSexException var3) {
            var3.printStackTrace();
        }
    }
}
