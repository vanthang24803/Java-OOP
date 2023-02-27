import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n, temp;
            do {
                System.out.println("Enetr number of arrays : ");
                n = Integer.parseInt(sc.nextLine());
            } while (n < 0);

            int array[] = new int[n];
            System.out.println("Enter elements of array : \n");
            for (int i = 0; i < n; i++) {
                System.out.println("Enter element " + i + " of array");
                array[i] = Integer.parseInt(sc.nextLine());
            }

            System.out.println("\nArray : ");
            for (int i = 0; i < n; i++) {
                System.out.println(array[i]);
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j <= n - 1; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            System.out.println("Array short : ");
            for (int i = 0; i < n; i++) {
                System.out.println(array[i]);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
