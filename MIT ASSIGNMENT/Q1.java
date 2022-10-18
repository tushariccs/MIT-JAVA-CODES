import java.util.*;

class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int a, b, result;

        switch (ch) {
            case 1:
                System.out.println("Enter the number");
                a = sc.nextInt();
                System.out.println("Enter the number");
                b = sc.nextInt();
                result = a + b;
                System.out.println("Addition" + result);
                break;
            case 2:
                System.out.println("Enter the number");
                a = sc.nextInt();
                System.out.println("Enter the number");
                b = sc.nextInt();
                result = a - b;
                System.out.println("Substraction" + result);
                break;
            case 3:
                System.out.println("Enter the number");
                a = sc.nextInt();
                System.out.println("Enter the number");
                b = sc.nextInt();
                result = a * b;
                System.out.println("Multiplication s" + result);
                break;
            case 4:
                System.out.println("Enter the number");
                a = sc.nextInt();
                System.out.println("Enter the number");
                b = sc.nextInt();
                result = a % b;
                System.out.println("Modulo" + result);
                break;

        }
        sc.close();

    }
}