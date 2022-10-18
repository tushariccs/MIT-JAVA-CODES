import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int avg, total = 0;
        int a[] = new int[6];

        // Input

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter the numbers");
            a[i] = sc.nextInt();
        }
        // Sum of all values
        for (int i = 1; i <= 5; i++) {
            total += a[i];
        }
        System.out.println(total);
        avg = total / 5; // Average

        System.out.println("Average: " + avg);
        sc.close();
    }
}
