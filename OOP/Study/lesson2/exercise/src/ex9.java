import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        String string;
        int kyTuInHoa = 0, kyTuThuong = 0, kyTuSo = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter string : ");
            string = scanner.nextLine();
        }
        for (int i = 0; i < string.length(); i++) {

            if (Character.isUpperCase(string.charAt(i))) {
                kyTuInHoa++;
            }

            if (Character.isLowerCase(string.charAt(i))) {
                kyTuThuong++;
            }

            if (Character.isDigit(string.charAt(i))) {
                kyTuSo++;
            }
        }

        System.out.println("Trong chuoi " + string +
                " co " + kyTuInHoa + " ky tu in hoa," +
                " co " + kyTuThuong + " ky tu in thuong" +
                " va co " + kyTuSo + " so.");
    }
}
