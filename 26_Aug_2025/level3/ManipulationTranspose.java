import java.util.*;

public class ManipulationTranspose {

    // Transpose matrix
    public static int[][] transpose(int[][] A) {
        int n = A.length, m = A[0].length;
        int[][] T = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    // Print matrix
    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int n = sc.nextInt(), m = sc.nextInt();

        int[][] A = new int[n][m];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] = sc.nextInt();

        System.out.println("\nTranspose of A = ");
        printMatrix(transpose(A));
    }
}
