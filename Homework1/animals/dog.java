package Homework1.animals;

public class dog extends animal {
    private String breed;

    public dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public String getBreed() {
        return breed;
    }
}