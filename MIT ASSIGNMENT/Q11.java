import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evencnt = 0;
        int oddcnt = 0;
        int a[] = new int[50];
        System.out.println("How many element to enter??");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evencnt++;
            } else {
                oddcnt++;
            }
        }
        System.out.println("Even number count is: " + evencnt);
        System.out.println("Odd number count is: " + oddcnt);
    }

}
