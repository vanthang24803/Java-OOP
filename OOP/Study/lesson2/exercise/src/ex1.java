import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            System.out.println("Enter a number : ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Enter b number :");
            b = Integer.parseInt(sc.nextLine());
            System.out.println("\n1.");
            System.out.println("Sum = " + (a + b));
            System.out.println("Subtract = " + (a - b));
            System.out.println("Multiply = " + (a * b));
            System.out.println("Split = " + (a / b));
            System.out.println("Split a % b = " + (a % b));
            System.out.println("\n2.");
            if (a > b) {
                System.out.println(a + " > " + b);
            } else if (a == b) {
                System.out.println(a + " == " + b);
            } else {
                System.out.println(a + " < " + b);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
