import java.util.Scanner;

public class c {
    public enum X {
        WINTER, SPRING, SUMMER, FALL
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int arr[]=new int[3];
        String arr[]=new String[3];
        for(int i=0;i<arr.length; i++)
        {
            arr[i]=sc.nextLine();
        }
        for (String s :arr) {
            System.out.println(s);
        }
    }
}
