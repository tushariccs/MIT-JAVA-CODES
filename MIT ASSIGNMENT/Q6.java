import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println("Enter the number");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        sc.close();
    }

}
