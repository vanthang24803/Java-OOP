import java.util.Scanner;

public class SinhVien {
    String name;
    String gender;
    int age;
    String birtday;
    String address;

    public SinhVien() {

    }

    public SinhVien(String name, String gender, int age, String birtday, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birtday = birtday;
        this.address = address;
    }

    public void InputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = input.nextLine();
        System.out.println("Enter gender: ");
        gender = input.nextLine();
        System.out.println("Enter age: ");
        age = Integer.parseInt(input.nextLine());
        System.out.println("Enter birtday: ");
        birtday = input.nextLine();
        System.out.println("Enter address: ");
        address = input.nextLine();
    }

    public void OutputInfo(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Birtday: " + birtday);
        System.out.println("Address: " + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirtday() {
        return birtday;
    }

    public void setBirtday(String birtday) {
        this.birtday = birtday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
