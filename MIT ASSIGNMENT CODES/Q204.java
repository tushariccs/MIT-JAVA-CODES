import java.util.*;

public class Q204 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");

        int a = sc.nextInt();
       double area = ((Math.sqrt(3)/2)*(a*a));
        System.out.println("Area of Equilateral Triangle"+area);
    }
}

