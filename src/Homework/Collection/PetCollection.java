package Homework.Collection;

import Homework.Context.PetContext;
import Homework.Exception.PetAlreadyExistsException;
import Homework.Object.Person;
import Homework.Object.Pet;
import Homework.Sorting.GnomeSort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PetCollection implements Collection<Pet> {
    private List<Pet> petList;

    private Integer idCounter = 0;

    public PetCollection() {
        this.petList = new ArrayList<>();
    }

    @Override
    public int size() {
        return this.petList.size();
    }

    @Override
    public boolean isEmpty() {
        return this.petList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.petList.contains(o);
    }

    @Override
    public Iterator<Pet> iterator() {
        return this.petList.iterator();
    }

    @Override
    public Object[] toArray() {
        return this.petList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.petList.toArray(a);
    }

    @Override
    public boolean add(Pet pet) {
        try {
            if (this.petList.contains(pet) || this.petList.get(pet.getId()) != null) {
                throw new PetAlreadyExistsException();
            }
        } catch (IndexOutOfBoundsException | NullPointerException ignored) {
        } catch (PetAlreadyExistsException e) {
            System.out.println(e.getMessage());
            return false;
        }
        pet.setId(this.idCounter++);
        this.petList.add(pet.getId(), pet);
        return true;
    }

    public Pet find(String petName) {
        for (Pet pet : this.petList) {
            if (pet.getName().equals(petName)) {
                return pet;
            }
        }
        return null;
    }

    public Pet find(Integer petId) {
        for (Pet pet : this.petList) {
            if (pet.getId().equals(petId)) {
                return pet;
            }
        }
        return null;
    }

    public List<Pet> sort() {
        return new GnomeSort<Pet>().sort(this.petList, new PetContext());
    }

    public void printPets() {
        for (Pet pet : this.sort()) {
            System.out.println(pet);
        }
    }

    public void changePetById(Integer petId, Person owner) {
        this.find(petId).setOwner(owner);
    }

    public void changePetById(Integer petId, Float weight) {
        this.find(petId).setWeight(weight);
    }

    public void changePetById(Integer petId, String name) {
        this.find(petId).setName(name);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
