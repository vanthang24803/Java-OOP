import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number : ");
            int day;
            day = Integer.parseInt(sc.nextLine());
            switch (day) {
                case 2:
                    System.out.println("Monday");
                    break;
                case 3:
                    System.out.println("Tuesday");
                    break;
                case 4:
                    System.out.println("Wednesday");
                    break;
                case 5:
                    System.out.println("Thursday");
                    break;
                case 6:
                    System.out.println("Friday");
                    break;
                case 7:
                    System.out.println("Saturday");
                    break;
                case 8:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid day!");
                    break;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
