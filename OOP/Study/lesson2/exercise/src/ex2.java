import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.println("Enter number : ");
            n = Integer.parseInt(sc.nextLine());
            if (n % 2 == 0) {
                System.out.println(n + " la so chan !");
            } else {
                System.out.println(n + " la so le!");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
