package Interface;

import java.util.Scanner;

interface p1 {
    int add(int a, int b);

    int sub(int a, int b);

    int mult(int a, int b);

    int div(int a, int b);

    int mod(int a, int b);
}

class Calculator implements p1 {
    int a, b, result;

    public int add(int a, int b) {
        this.a = a;
        this.b = b;
        result = a + b;
        System.out.println(result);
        return result;
    }

    public int sub(int a, int b) {
        this.a = a;
        this.b = b;
        result = a - b;
        System.out.println(result);
        return result;
    }

    public int mult(int a, int b) {
        this.a = a;
        this.b = b;
        result = a * b;
        System.out.println(result);
        return result;
    }

    public int div(int a, int b) {
        this.a = a;
        this.b = b;
        result = a / b;
        System.out.println(result);
        return result;
    }

    public int mod(int a, int b) {
        this.a = a;
        this.b = b;
        result = a % b;
        System.out.println(result);
        return result;
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Modulo");
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println("Enter your first number");
                int b = sc.nextInt();
                System.out.println("Enter your second number");
                int d = sc.nextInt();
                c.add(b, d);
                break;
            case 2:
                System.out.println("Enter your first number");
                int e = sc.nextInt();
                System.out.println("Enter your second number");
                int f = sc.nextInt();
                c.sub(e, f);
                break;
            case 3:
                System.out.println("Enter your first number");
                int g = sc.nextInt();
                System.out.println("Enter your second number");
                int h = sc.nextInt();
                c.mult(g, h);
                break;
            case 4:
                System.out.println("Enter your first number");
                int i = sc.nextInt();
                System.out.println("Enter your second number");
                int j = sc.nextInt();
                c.div(i, j);
                break;
            case 5:
                System.out.println("Enter your first number");
                int k = sc.nextInt();
                System.out.println("Enter your second number");
                int l = sc.nextInt();
                c.mod(k, l);
                break;
            default:
                System.out.println("Wrong option");

        }
        sc.close();

    }

}
