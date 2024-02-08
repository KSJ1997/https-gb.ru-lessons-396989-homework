package Homework1.animals;

public abstract class animal {
    private String name;
    private int age;

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();
}