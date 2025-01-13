public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}