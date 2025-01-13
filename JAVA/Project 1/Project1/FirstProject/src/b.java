import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        int a[] = new int[3];
        Scanner ab = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = ab.nextInt();
        }
        for(int x: a)
        {
            System.out.println(x);
        }
        System.out.println("Entered array: " + Arrays.toString(a));

        a[0] = 10;
        a[1] = 29;
        int x[] = { 2, 3, 32 };
        System.out.println(x.length);
        System.out.println(a[0]);
        for (int i = 0; i <= 10; i++) {
            System.out.println("Prince");
        }
    }

}
