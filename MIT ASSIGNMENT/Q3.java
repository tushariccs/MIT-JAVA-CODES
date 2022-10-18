import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int decimalno, quot;

        Scanner sc = new Scanner(System.in);
        int bin_num[] = new int[20];
        int i = 1, j;

        System.out.println("Enter the decimal number");

        decimalno = sc.nextInt();

        quot = decimalno;
        // removing 1,0's from the number using modulo
        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        sc.close();
    }

}
