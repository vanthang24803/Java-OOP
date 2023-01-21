import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Hotel hotel = new Hotel();

            while (true) {
                System.out.println("\nApplication Manager Candidate");
                System.out.println("Enter 1: To insert person for rent");
                System.out.println("Enter 2: To remove person by passport");
                System.out.println("Enter 3: To calculator price by passport");
                System.out.println("Enter 4: To show infor");
                System.out.println("Enter 5: To exit");

                int line = Integer.parseInt(scanner.nextLine());

                switch (line) {
                    case 1: {
                        System.out.println("Enter name : ");
                        String name = scanner.nextLine();
                        System.out.println("Enter age : ");
                        int age = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter passport : ");
                        String passport = scanner.nextLine();
                        System.out.println("Choise a to rent room type A");
                        System.out.println("Choise b to rent room type B");
                        System.out.println("Choise c to rent room type C");

                        String choose = scanner.nextLine();
                        Room room;
                        if (choose.equals("a")) {
                            room = new RoomA();
                        } else if (choose.equals("b")) {
                            room = new RoomB();
                        } else if (choose.equals("c")) {
                            room = new RoomC();
                        } else {
                            continue;
                        }

                        System.out.println("Enter numer day for rent : ");
                        int numberRent = Integer.parseInt(scanner.nextLine());
                        Person person = new Person(name, age, passport, room, numberRent);
                        hotel.addPerson(person);
                        scanner.nextLine();
                        break;
                    }

                    case 2: {
                        System.out.println("Eter passport : ");
                        String passport = scanner.nextLine();
                        hotel.delete(passport);
                        scanner.nextLine();
                        break;
                    }

                    case 3: {
                        System.out.println("Eter passport : ");
                        String passport = scanner.nextLine();
                        System.out.println("Price : " + hotel.caculator(passport));
                        break;
                    }

                    case 4: {
                        hotel.show();
                        break;
                    }
                    case 5: {
                        return;
                    }
                    default:
                        System.out.println("Error!");
                        continue;
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
