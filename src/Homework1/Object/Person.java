package Homework1.Object;

public class Person {
    private String name;

    private Integer age;

    private Sex sex;

    public Person(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public Sex getSex() {
        return sex;
    }

    public Person setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + sex;
    }
}
