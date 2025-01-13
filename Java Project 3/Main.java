class Calculator {
    // Static method for addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Non-static method for object-specific calculation
    public int calculateArea(int length, int width) {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling static method
        int sum = Calculator.add(10, 20);

        // Creating object and calling non-static method
        Calculator calculator = new Calculator();
        int area = calculator.calculateArea(5, 10);
    }
}