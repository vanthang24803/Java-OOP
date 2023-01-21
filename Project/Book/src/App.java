import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            Manager manager = new Manager();
            while (true) {
                System.out.println("Application Manager Document");
                System.out.println("Enter 1: To insert document");
                System.out.println("Enter 2: To search document by category: ");
                System.out.println("Enter 3: To show information documents");
                System.out.println("Enter 4: To remove document by id");
                System.out.println("Enter 5: To exit");
                String line = scanner.nextLine();
                switch (line) {
                    case "1": {
                        System.out.println("Enter a: to insert Book");
                        System.out.println("Enter b: to insert Newspaper");
                        System.out.println("Enter c: to insert Journal");
                        String type = scanner.nextLine();
                        switch (type) {
                            case "a": {
                                System.out.print("Enter ID: ");
                                String id = scanner.nextLine();
                                System.out.print("Enter nxb:");
                                String nxb = scanner.nextLine();
                                System.out.print("Enter number: ");
                                int age = Integer.parseInt(scanner.nextLine());
                                System.out.print("Enter author: ");
                                String author = scanner.nextLine();
                                System.out.print("Enter page number: ");
                                int pageNumber = Integer.parseInt(scanner.nextLine());
                                Document book = new Book(id, nxb, pageNumber, author, age);
                                manager.addDocument(book);
                                System.out.println(book.toString());
                                scanner.nextLine();
                                break;
                            }

                            case "b": {
                                System.out.print("Enter ID: ");
                                String id = scanner.nextLine();
                                System.out.print("Enter nxb:");
                                String nxb = scanner.nextLine();
                                System.out.print("Enter number: ");
                                int number = Integer.parseInt(scanner.nextLine());
                                System.out.print("Enter Day issue: ");
                                int dayIssue = Integer.parseInt(scanner.nextLine());
                                Document newpaper = new Newpaper(id, nxb, number, dayIssue);
                                manager.addDocument(newpaper);
                                System.out.println(newpaper.toString());
                                scanner.nextLine();
                                break;
                            }

                            case "c": {
                                System.out.print("Enter ID: ");
                                String id = scanner.nextLine();
                                System.out.print("Enter nxb:");
                                String nxb = scanner.nextLine();
                                System.out.print("Enter number: ");
                                int number = Integer.parseInt(scanner.nextLine());
                                System.out.print("Enter issue number : ");
                                int issueNumber = Integer.parseInt(scanner.nextLine());
                                System.out.print("Enter issue month : ");
                                int issueMonth = Integer.parseInt(scanner.nextLine());
                                Document journal = new Journal(id, nxb, number, issueNumber, issueMonth);
                                manager.addDocument(journal);
                                System.out.println(journal.toString());
                                scanner.nextLine();
                                break;
                            }

                            default:
                                break;
                        }
                        break;
                    }
                    case "2": {
                        System.out.println("Enter a to search book");
                        System.out.println("Enter b to search newspaper");
                        System.out.println("Enter a to search journal");
                        String choise = scanner.nextLine();
                        switch (choise) {
                            case "a": {
                                manager.searchByBook();
                                break;
                            }
                            case "b": {
                                manager.searchByNewpaper();
                                break;
                            }
                            case "c": {
                                manager.searchByJournal();
                                break;
                            }

                            default:
                                System.out.println("Error!");
                                break;
                        }
                        break;
                    }
                    case "3": {
                        manager.showInfor();
                        break;
                    }
                    case "4": {
                        System.out.print("Enter id to remove: ");
                        String id = scanner.nextLine();
                        System.out.println(manager.deleteDocument(id) ? "Sucess!" : "Fail!");
                    }
                        break;
                    case "5": {
                        return;
                    }
                    default: {
                        System.out.println("Error!");
                        continue;
                    }
                }
            }
        }
    }
}