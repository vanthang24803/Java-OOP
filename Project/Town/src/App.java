import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            Town town = new Town();
            while (true) {
                System.out.println("\nApplication Manager Town");
                System.out.println("Enter 1: To insert Town");
                System.out.println("Enter 2: To show information of Town: ");
                System.out.println("Enter 3: To exit");
                int line = Integer.parseInt(scanner.nextLine());
                switch (line) {
                    case 1: {
                        System.out.println("Enter a: to insert Person");
                        System.out.println("Enter b: to insert Family");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                System.out.println("Enter name : ");
                                String name = scanner.nextLine();
                                System.out.print("Enter age:");
                                int age = Integer.parseInt(scanner.nextLine());
                                System.out.println("Enter job name : ");
                                String job = scanner.nextLine();
                                System.out.println("Enter pasport :");
                                String pasport = scanner.nextLine();
                                Person person = new Person(name, age, job, pasport);
                                town.addPerson(person);
                                System.out.println(person.toString());
                                break;
                            }

                            case "b": {
                                System.out.println("Enter name : ");
                                String name = scanner.nextLine();
                                System.out.print("Enter age:");
                                int age = Integer.parseInt(scanner.nextLine());
                                System.out.println("Enter job name : ");
                                String job = scanner.nextLine();
                                System.out.println("Enter pasport :");
                                String pasport = scanner.nextLine();
                                System.out.println("Enter number house : ");
                                int numberHouse = Integer.parseInt(scanner.nextLine());
                                System.out.println("Enter member family : ");
                                int memberFamily = Integer.parseInt(scanner.nextLine());
                                Family family = new Family(name, age, job, pasport, numberHouse, memberFamily);
                                town.addFamily(family);
                                System.out.println(family.toString());
                                break;
                            }
                            default:
                                System.out.println("Invalid");
                                break;
                        }
                        break;
                    }

                    case 2: {
                        System.out.println("Enter a: Show Person");
                        System.out.println("Enter b: Show Family");
                        String choose = scanner.nextLine();
                        switch (choose) {
                            case "a": {
                                town.showInforPerson();
                                break;
                            }
                            case "b": {
                                town.showInforFamily();
                            }
                            default:
                                System.out.println("Again!");
                                continue;
                        }
                        break;
                    }

                    case 3: {
                        return;
                    }

                    default:
                        System.out.println("Invalid");
                        continue;
                }
            }
        }
    }
}
