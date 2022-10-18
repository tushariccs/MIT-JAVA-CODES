import java.util.*;
public class Q205 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the diagonals");

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        double area = (0.5*(d1*d2));

        System.out.println("Area of Rhombus"+area);
    }
}

