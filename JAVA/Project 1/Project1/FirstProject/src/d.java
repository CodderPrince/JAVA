public class d {
    public static void main(String[] args) {
        // String s = "I@Love@Bangladesh";
        String s = "I     Love Bangladesh";
        // String[] a = s.split("@");
          String[] a = s.split("\\s+");

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
