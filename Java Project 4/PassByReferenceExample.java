import Person; // Assuming the Person class is in the same package or file

public class PassByReferenceExample {
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        changeName(person);
        System.out.println("Person's name after method call: " + person.getName()); // Output: Alice
    }

    public static void changeName(Person p) {
        p.setName("Alice");
    }
}