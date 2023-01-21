import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Student> StudentList = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        int choose;
        do {
            showMenu();
            System.out.println("Your Choose: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    int n;
                    System.out.println("Enter n Student : ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student std = new Student();
                        std.InputInfo();

                        StudentList.add(std);
                    }
                    break;
                case 2:
                    for (int i = 0; i < StudentList.size(); i++) {
                        StudentList.get(i).OutputInfo();
                    }
                    break;
                case 3:
                    int minIndex = 0, maxIndex = 0;
                    float minMark, maxMark;
                    minMark = StudentList.get(0).getMark();
                    maxMark = StudentList.get(0).getMark();

                    for (int i = 1; i < StudentList.size(); i++) {
                        if (StudentList.get(i).getMark() < minMark) {
                            minIndex = i;
                            minMark = StudentList.get(i).getMark();
                        }

                        if (StudentList.get(i).getMark() > maxMark) {
                            maxIndex = i;
                            maxMark = StudentList.get(i).getMark();
                        }
                    }

                    System.out.println("Studet Max Mark :");
                    StudentList.get(maxIndex).OutputInfo();
                    System.out.println("Student Min Mark :");
                    StudentList.get(minIndex).OutputInfo();
                    break;
                case 4:
                    System.out.println("Ennter MSV Search : ");
                    String rollNoSearch = sc.nextLine();
                    int cout = 0;
                    for (Student student : StudentList) {
                        if (student.getRollNo().equalsIgnoreCase(rollNoSearch)) {
                            student.OutputInfo();
                            cout++;
                        }
                    }

                    if (cout == 0) {
                        System.out.println("None");
                    }
                    break;
                case 5:
                    Collections.sort(StudentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            int cmp = o1.getName().compareTo(o2.getName());
                            if (cmp >= 0) {
                                return -1;
                            }
                            return 1;
                        }
                    });

                    for (int i = 0; i < StudentList.size(); i++) {
                        StudentList.get(i).OutputInfo();
                    }
                    break;
                case 6:
                    Collections.sort(StudentList, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getMark() >= o2.getMark() ? 1 : -1;
                        }
                    });

                    for (int i = 0; i < StudentList.size(); i++) {
                        if (StudentList.get(i).checkScholarship()) {
                            StudentList.get(i).OutputInfo();
                        }
                    }
                    break;
                case 7:
                    System.out.println("Good Bye !");
                    break;
                default:
                    System.err.println("Error!");
                    break;
            }

        } while (choose != 7);
    }

    static void showMenu() {
        System.out.println("1.Enter n Student ");
        System.out.println("2.Print infomation Student");
        System.out.println("3.Print Max and Min for Mark Student");
        System.out.println("4.Search student for RollNo ");
        System.out.println("5.Sort A-Z name Student and Print Name");
        System.out.println("6.Print Name of student Scholarship and Short Mark Desc");
        System.out.println("7.Exit");

    }
}
