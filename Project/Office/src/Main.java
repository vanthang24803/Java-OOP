import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            ManagerOfficer managerOfficer = new ManagerOfficer();
            while (true) {
                System.out.println("Application Manager Officer");
                System.out.println("Enter 1: To insert officer");
                System.out.println("Enter 2: To search officer by name: ");
                System.out.println("Enter 3: To show information officers");
                System.out.println("Enter 4: To exit");
                String line = scanner.nextLine();

                switch (line) {
                    case "1": {
                        System.out.println("Enter a: to insert Enginner");
                        System.out.println("Enter b: to insert Worker");
                        System.out.println("Enter c: to insert Staff");
                        String type = scanner.nextLine();

                        switch (type) {
                            case "a": {
                                System.out.println("Enter name : ");
                                String name = scanner.nextLine();
                                System.out.print("Enter age:");
                                int age = Integer.parseInt(scanner.nextLine());
                                System.out.print("Enter gender: ");
                                String gender = scanner.nextLine();
                                System.out.print("Enter address: ");
                                String address = scanner.nextLine();
                                System.out.print("Enter branch: ");
                                String branch = scanner.nextLine();
                                Officer engineer = new Engineer(name, age, gender, address, branch);
                                managerOfficer.addOfficer(engineer);
                                System.out.println(engineer.toString());
                                break;
                            }
                            case "b": {
                                System.out.println("Enter name : ");
                                String name = scanner.nextLine();
                                System.out.print("Enter age:");
                                int age = Integer.parseInt(scanner.nextLine());
                                System.out.print("Enter gender: ");
                                String gender = scanner.nextLine();
                                System.out.print("Enter address: ");
                                String address = scanner.nextLine();
                                System.out.print("Enter level: ");
                                int level = Integer.parseInt(scanner.nextLine());
                                Officer worker = new Worker(name, age, gender, address, level);
                                managerOfficer.addOfficer(worker);
                                System.out.println(worker.toString());
                                break;
                            }
                            case "c": {
                                System.out.println("Enter name : ");
                                String name = scanner.nextLine();
                                System.out.print("Enter age:");
                                int age = Integer.parseInt(scanner.nextLine());
                                System.out.print("Enter gender: ");
                                String gender = scanner.nextLine();
                                System.out.print("Enter address: ");
                                String address = scanner.nextLine();
                                System.out.print("Enter task: ");
                                String task = scanner.nextLine();
                                Officer staff = new Staff(name, age, gender, address, task);
                                managerOfficer.addOfficer(staff);
                                System.out.println(staff.toString());
                                break;
                            }
                            default:
                                System.out.println("Invalid");
                                break;
                        }
                        break;
                    }
                    case "2": {
                        System.out.print("Enter name to search: ");
                        String name = scanner.nextLine();
                        managerOfficer.searchOfficerByName(name).forEach(officer -> {
                            System.out.println(officer.toString());
                        });
                        break;
                    }
                    case "3": {
                        managerOfficer.showListOfOfficers();
                        break;
                    }
                    case "4": {
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
