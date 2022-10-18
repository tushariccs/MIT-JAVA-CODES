import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int sum1 = 0;
        // Randomily sized array size

        System.out.println("Enter the size of an array in a & b variables");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[][] = new int[a][b];

        // Input of values in the matrix
        System.out.println("Enter the values in the  matrix");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix display");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Diagonal Sum");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Primary Diagonal: " + sum);

        // Secondary matrix
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if ((i + j) == (b - 1))
                    sum1 += arr[i][j];
            }
        }
        System.out.println("Secondary diagonal: " + sum1);

    }

}
