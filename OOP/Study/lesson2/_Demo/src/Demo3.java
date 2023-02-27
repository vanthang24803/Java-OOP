import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a, b;
            System.out.println("Enter a :");
            a = Integer.parseInt(sc.nextLine());
            System.out.println("Enter b :");
            b = Integer.parseInt(sc.nextLine());
            int max = 0;
            int min = 0;
            if (a > b) {
                max = a;
                min = b;
            } else {
                max = b;
                min = a;
            }
            System.out.println("Max = " + max + " " + "Min = " + min);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
