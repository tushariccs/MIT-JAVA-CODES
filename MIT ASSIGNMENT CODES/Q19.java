import java.util.*;
public class Q19 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Seconds");
        int seconds = sc.nextInt();
        int p1 = seconds%60;
        int p2=seconds/60;
        int p3 = p2%60;
        p2=p2/60;
        System.out.println(p2+":"+p3+":"+p1);
        System.out.println("\n");
    }
}
