import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            int age;
            System.out.println("Enter name : ");
            name = sc.nextLine();
            System.out.println("Enter age : ");
            age = Integer.parseInt(sc.nextLine());
            if (age >= 18) {
                System.out.println("Ban " + name + " da gia !");
            } else if (age >= 16) {
                System.out.println("Ban " + name + " o do tuoi truong thanh !");
            } else {
                System.out.println("Ban " + name + " o do tuoi vi thanh nien !");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
