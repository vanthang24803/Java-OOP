import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        int number, sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Enter number : ");
                number = Integer.parseInt(sc.nextLine());
                sum += number;
            } while (sum < 100);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("Sum : " + sum);
    }
}
