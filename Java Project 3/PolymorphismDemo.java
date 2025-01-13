class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Animal reference, Dog object
        animal.makeSound(); // Output: Woof! (dynamic binding)

        Animal anotherAnimal = new Cat(); // Animal reference, Cat object
        anotherAnimal.makeSound(); // Output: Meow! (dynamic binding)
    }
}