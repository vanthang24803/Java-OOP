import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Manager manager = new Manager();
            while (true) {
                System.out.println("\nApplication Manager ");
                System.out.println("Enter 1: To insert teacher");
                System.out.println("Enter 2: To remove teacher by id");
                System.out.println("Enter 3: Get salary by id");
                System.out.println("Enter 4: To show infor");
                System.out.println("Enter 5: To exit");
                int line = Integer.parseInt(scanner.nextLine());
                switch (line) {
                    case 1: {
                        System.out.println("\nEnter name : ");
                        String name = scanner.nextLine();
                        System.out.println("Enter age : ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter id: ");
                        String id = scanner.nextLine();
                        System.out.println("Enter Home Town : ");
                        String hometown = scanner.nextLine();
                        System.out.println("Enter Salary : ");
                        double salary = Double.parseDouble(scanner.nextLine());
                        System.out.println("Enter bonus :");
                        double bonus = Double.parseDouble(scanner.nextLine());
                        System.out.println("Enter penaty :");
                        double penaty = Double.parseDouble(scanner.nextLine());

                        Teacher teacher = new Teacher(id, name, age, hometown, salary, bonus, penaty);
                        manager.addTeacher(teacher);
                        scanner.nextLine();
                        break;
                    }

                    case 2: {
                        System.out.println("Enter id : ");
                        String id = scanner.nextLine();
                        manager.removeTeacher(id);
                        System.out.println("\nSuccess!");
                        scanner.nextLine();
                        break;
                    }

                    case 3: {
                        System.out.println("Enter id : ");
                        String id = scanner.nextLine();
                        double realSalary = manager.getSalary(id);
                        System.out.println("Real Salaly :" + realSalary);
                        break;
                    }

                    case 4: {
                        manager.display();
                        break;
                    }

                    case 5: {
                        return;
                    }

                    default:
                        System.out.println("Invalid");
                        continue;
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
