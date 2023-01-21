import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Manager manager = new Manager();

            while (true) {
                System.out.println("\nApplication Manager Library");
                System.out.println("Enter 1: To insert book");
                System.out.println("Enter 2: To show information of book: ");
                System.out.println("Enter 3: To remove book by id");
                System.out.println("Enter 4: To exit");
                int line = Integer.parseInt(scanner.nextLine());
                switch (line) {
                    case 1:
                        System.out.println("Enter name :");
                        String name = scanner.nextLine();
                        System.out.println("Enter age :");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter school :");
                        String school = scanner.nextLine();
                        System.out.println("Enter id :");
                        String id = scanner.nextLine();
                        System.out.println("Enter Brrow Date :");
                        int brrowDate = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter Payment Date :");
                        int paymentDate = Integer.parseInt(scanner.nextLine());
                        System.out.println("Book ID : ");
                        int bookId = Integer.parseInt(scanner.nextLine());
                        Card card = new Card(name, age, school, id, brrowDate, paymentDate, bookId);
                        manager.addCard(card);
                        break;
                    case 2:
                        manager.display();
                        break;
                    case 3:
                        System.out.println("Enter id : ");
                        String num = scanner.nextLine();
                        manager.removeCard(num);
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Agian!");
                        continue;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
