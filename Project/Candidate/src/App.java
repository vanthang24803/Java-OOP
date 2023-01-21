import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("\nApplication Manager Candidate");
            System.out.println("Enter 1: To insert candidate");
            System.out.println("Enter 2: To show information of candidate: ");
            System.out.println("Enter 3: To search candidate by id");
            System.out.println("Enter 4: To exit");
            int line = Integer.parseInt(scanner.nextLine());
            switch (line) {
                case 1: {
                    System.out.println("Enter a: to insert Candidate A");
                    System.out.println("Enter b: to insert Candidate B");
                    System.out.println("Enter c: to insert Candidate C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            manager.addCandidate(createCadidate(scanner, "a"));
                            break;
                        }
                        case "b": {
                            manager.addCandidate(createCadidate(scanner, "b"));
                            break;
                        }
                        case "c": {
                            manager.addCandidate(createCadidate(scanner, "c"));
                        }
                        default:
                            System.out.println("Error!");
                            break;
                    }
                    break;
                }

                case 2: {
                    manager.showInfor();
                    break;
                }

                case 3: {
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    Candidate candidate = manager.searchById(id);
                    if (candidate == null) {
                        System.out.println("No found!");
                    } else {
                        System.out.println(candidate.toString());
                    }
                    break;
                }

                case 4:
                    return;

                default:
                    System.out.println("Error!");
                    continue;
            }
        }
    }

    private static Candidate createCadidate(Scanner scanner, String cate) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Priotity: ");
        int priority = Integer.parseInt(scanner.nextLine());
        if (cate.equals("a")) {
            return new CandidateA(id, name, address, priority);
        } else if (cate.equals("b")) {
            return new CandidateB(id, name, address, priority);
        } else {
            return new CandidateC(id, name, address, priority);
        }
    }

}
