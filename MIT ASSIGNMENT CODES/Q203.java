import java.util.Scanner;

public class Q203 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and height");

        int b = sc.nextInt();
        int h = sc.nextInt();
        double area = 0.5*(b*h);

        System.out.println("Area of Triangle"+area);
    }
}

