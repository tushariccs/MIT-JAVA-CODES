
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long binaryNumber, decimalNumber = 0, j = 1, rem;
        System.out.print("Enter a binary number: ");
        binaryNumber = sc.nextLong();

        while (binaryNumber != 0) {
            rem = binaryNumber % 10;
            decimalNumber = decimalNumber + rem * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }
        System.out.println("Decimal Number: " + decimalNumber);
        sc.close();
    }
}
