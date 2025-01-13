import java.util.List;
import java.util.ArrayList;

public class AutoboxingExample {
    public static void main(String[] args) {
        // Autoboxing examples
        Integer i = 10; // Assigning primitive to wrapper class
        List<Integer> list = new ArrayList<>();
        list.add(20); // Passing primitive to method expecting wrapper class

        // Unboxing examples
        int x = i; // Assigning wrapper class to primitive
        int y = list.get(0); // Getting primitive from wrapper class
    }
}