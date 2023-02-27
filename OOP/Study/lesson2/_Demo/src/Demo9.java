import java.util.Scanner;

public class Demo9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int m, n;
            System.out.println("Enter rows of matrix : ");
            m = Integer.parseInt(sc.nextLine());
            System.out.println("Enter columns of matrix : ");
            n = Integer.parseInt(sc.nextLine());

            int A[][] = new int[m][n];

            System.out.println("Enter elements of matrix : ");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("A[" + i + "][" + j + "] = ");
                    A[i][j] = Integer.parseInt(sc.nextLine());
                }
            }

            int max = A[0][0];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (max < A[i][j]) {
                        max = A[i][j];
                    }
                }
            }

            System.out.println("Max of matrix is : " + max);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
