public class PrintEven24 {
    // Create a program that prints all the even numbers between 0 and 500
    public static void main(String[] args) {
        for (int i = 0; i < 499; i++) {
            if ((i+1)%2==0) {
                System.out.println(i+1);
            }
        }
    }
}
