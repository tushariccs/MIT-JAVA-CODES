import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int digit;
        System.out.println("Enter the number");
        int num = sc.nextInt();

        while (num != 0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println(sum);
        sc.close();
    }

}
