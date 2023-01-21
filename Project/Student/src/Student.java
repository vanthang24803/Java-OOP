import java.util.Scanner;

public class Student extends SinhVien {
    String rollNo; // MaSinhVien
    float mark; // DiemTrungBinh
    String email;// Email

    // Contructor
    Student() {

    }


    // Input
    @Override
    public void InputInfo() {
        super.InputInfo();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter MSV: ");
        while (!setRollNo(input.nextLine()))
            ;
        System.out.println("Enter mark: ");
        while (true) {
            Float markInput = Float.parseFloat(input.nextLine());
            boolean check = setMark(markInput);
            if (check) {
                break;
            }
        }

        System.out.println("Enter email: ");
        while (!setEmail(input.nextLine()))
            ;
    }

    // Output
    @Override
    public void OutputInfo() {
        super.OutputInfo();
        System.out.println("MSV: " + rollNo);
        System.out.println("Mark: " + mark);
        System.out.println("Email: " + email);
    }

    // Geter , Seter
    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if (rollNo != null && rollNo.length() == 8) {
            this.rollNo = rollNo;
            return true;
        } else {
            System.err.println("\nEnter again");
            return false;
        }
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.err.println("Again! Enter 8 characters !");
            return false;
        }
    }

    public float getMark() {
        return mark;
    }

    public boolean setMark(float mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
            return true;
        } else {
            System.err.println("\nAgain! Mark 0 <= 10 !");
            return false;
        }
    }

    public boolean checkScholarship() {
        return mark >= 8;
    }
}
