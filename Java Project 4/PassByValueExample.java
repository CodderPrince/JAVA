public class PassByValueExample {
    public static void main(String[] args) {
        int x = 10;
        changeValue(x);
        System.out.println("Value of x after method call: " + x); // Output: 10
    }

    public static void changeValue(int y) {
        y = 20;
    }
}