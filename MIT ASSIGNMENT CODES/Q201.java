import java.util.Scanner;
public class Q201 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");

        int r = sc.nextInt();
        final double pi = 3.142;
        double area = pi*r*r;

        System.out.println("Area of Circle"+area);
    }
}
