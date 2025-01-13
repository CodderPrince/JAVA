// Main.java
public class Main {
    public static void main(String[] args) {
        // Accessing static members
        
        // Accessing static final variable PI
        System.out.println("PI: " + MathOperations.PI);

        // Calling static methods
        
        // Calling static method add()
        int sum = MathOperations.add(5, 3);
        System.out.println("Sum: " + sum);

        // Calling static method multiply()
        int product = MathOperations.multiply(4, 6);
        System.out.println("Product: " + product);
    }
}
