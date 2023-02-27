import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            int sum = 0;
            while (sum < 100) {
                System.out.println("Enter a number :");
                n = Integer.parseInt(sc.nextLine());
                sum += n;
            }
            System.out.println("Sum = " + sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
