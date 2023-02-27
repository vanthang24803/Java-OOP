import java.util.Scanner;

public class Demo8 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            do {
                System.out.println("Enter number of array : ");
                n = Integer.parseInt(sc.nextLine());
            } while (n < 1);
            
            int A[] = new int[n];
            System.out.println("Enter number of array : ");
            for(int i = 0; i < n; i++){
                System.out.println("Number " + i + " : " );
                A[i] = Integer.parseInt(sc.nextLine()); 
            }
            double sum = 0;
            for(int i = 0; i < n; i++){
                if(A[i] % 2 == 0){
                    sum += A[i];
                }
            }
            System.out.println("Sum = " + sum);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
