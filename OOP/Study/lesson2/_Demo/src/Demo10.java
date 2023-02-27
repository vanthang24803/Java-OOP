import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String string;
            char characters;
            System.out.println("Enter a string : ");
            string = sc.nextLine();
            System.out.println("Character of string is : ");
            for(int i = 0; i < string.length(); i++){
                characters = string.charAt(i);
                System.out.println(characters);
            }
        }
    }
}