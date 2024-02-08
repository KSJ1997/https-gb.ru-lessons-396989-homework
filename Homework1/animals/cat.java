package Homework1.animals;

public class cat extends animal {
    private boolean hasStripes;

    public cat(String name, int age, boolean hasStripes) {
        super(name, age);
        this.hasStripes = hasStripes;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    public boolean hasStripes() {
        return hasStripes;
    }
}