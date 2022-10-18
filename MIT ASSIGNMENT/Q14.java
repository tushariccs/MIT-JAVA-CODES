import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit, sum = 0;
        System.out.println("Enter the number");
        int no = sc.nextInt();
        if (no == 0) {
            System.out.println("Number is zero");
        } else if (no > 0) {
            while (no != 0) {
                digit = no % 10;
                sum += digit;
                no = no / 10;
            }
            System.out.println("Positive number sum is: " + sum);
        } else {
            System.out.println("Number is negative");
        }
        sc.close();
    }

}
