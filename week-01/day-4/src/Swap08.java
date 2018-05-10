public class Swap08 {
    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;
        int aa = a;
        int bb = b;

        System.out.println(a);
        System.out.println(b);

        a = bb;
        b = aa;

        System.out.println(a);
        System.out.println(b);
    }
}
