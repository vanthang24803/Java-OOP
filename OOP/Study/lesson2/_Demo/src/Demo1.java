import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            int age;
            System.out.println("Enter name :");
            name = sc.nextLine();
            System.out.println("Enter age :");
            age = Integer.parseInt(sc.nextLine());
            System.out.println("Name: " + name + "  " + "Age: " + age);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
