// Abstract class Animal
abstract class Animal {
    // Abstract method makeSound
    public abstract void makeSound();
}

// Dog class extends Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Cat class extends Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        // Create an array of Animal references
        Animal[] animals = new Animal[2];

        // Create Dog and Cat objects
        animals[0] = new Dog();
        animals[1] = new Cat();

        // Call makeSound() on each animal
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}