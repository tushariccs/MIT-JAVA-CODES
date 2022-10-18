import java.util.Scanner;
public class Q202 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth");

        int r = sc.nextInt();
        int c = sc.nextInt();
        double area = r*c;

        System.out.println("Area of Rectangle"+area);
    }

}
