package Homework.Object;

public class Pet {
    private Integer id;
    private String name;
    private Person owner;
    private Float weight;

    public Pet(String name, Person owner, Float weight) {
        this.name = name;
        this.owner = owner;
        this.weight = weight;
    }

    public Integer getId() {
        return this.id;
    }

    public Pet setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Pet setName(String name) {
        this.name = name;
        return this;
    }

    public Person getOwner() {
        return this.owner;
    }

    public Pet setOwner(Person owner) {
        this.owner = owner;
        return this;
    }

    public Float getWeight() {
        return this.weight;
    }

    public Pet setWeight(Float weight) {
        this.weight = weight;
        return this;
    }

    public String toString() {
        return this.id + " " + this.name + " " + this.weight + " Owner: " + this.owner;
    }
}

