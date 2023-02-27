import java.util.Scanner;

public class ex6 {

    public static long factorial(int n) {
        long factorial = 1;
        if (n == 0 || n == 1) {
            return factorial;
        } else {
            for (int i = 2; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do {
                System.out.println("Enter a number : ");
                n = Integer.parseInt(sc.nextLine());
                System.out.println("Factorial of  " + n + " is : " + factorial(n));
            } while (n < 1);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
