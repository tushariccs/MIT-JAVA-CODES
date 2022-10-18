import java.util.*;
public class Q2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        //I/p
        //First matrix
        System.out.println("First matrix values");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++) {
                a[i][j]=sc.nextInt();
            }

        }
        //Second matrix
        System.out.println("Second Matrix values");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++) {
                b[i][j]=sc.nextInt();
            }

        }
        //Addition Matrix
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++) {
                c[i][j]=a[i][j]+b[i][j];
            }

        }
        System.out.println("Addition of Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();

        }
        sc.close();
    }
}
