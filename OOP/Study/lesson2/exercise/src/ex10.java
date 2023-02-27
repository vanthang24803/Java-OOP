import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String string;
            char kyTu;
            int count = 0;
            do {
                System.out.println("Enter string : ");
                string = scanner.nextLine();
            } while (string.length() > 80);
            System.out.println("Enter ky tu : ");
            kyTu = scanner.next().charAt(0);
            for (int i = 0; i < string.length(); i++) {
                if (kyTu == string.charAt(i)) {
                    count++;
                }
            }
            System.out.println("So lan xuat hien cua ky tu " + "[ " 
            +kyTu+ " ]" +" trong chuoi " +" [ " + string + " ] "+ " = " + count);
        } 
    }
}
