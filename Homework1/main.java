package Homework1;

import Homework1.animals.animal;
import Homework1.animals.dog;
import Homework1.animals.cat;
import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) {
        animal[] animals = {
                new dog("Buddy", 3, "Golden Retriever"),
                new cat("Whiskers", 2, true)
        };

        for (animal animal : animals) {
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());

            try {
                Method makeSoundMethod = animal.getClass().getMethod("makeSound");
                makeSoundMethod.invoke(animal);
            } catch (Exception e) {
                System.out.println("This animal does not make a sound.");
            }

            System.out.println(); 
        }
    }
}