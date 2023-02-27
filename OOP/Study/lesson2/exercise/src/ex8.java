import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n, x, sum = 0;
            float avg;
            System.out.println("Enter numbers : ");
            n = Integer.parseInt(sc.nextLine());

            for (int i = 0; i <= n; i++) {
                System.out.println("Enter number " + i + " : ");
                x = Integer.parseInt(sc.nextLine());
                sum += x;
            }
            avg = (float) sum / n;
            System.out.println("\nAverage : " + avg);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
