package Part2;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        double si;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle");
        int principle = sc.nextInt();
        System.out.println("Period of Despoit");
        int time = sc.nextInt();

        if (principle <= 10000 && time <= 2) {
            si = principle * time * 0.09;
            System.out.println("Simple Interest:" + si);
        } else if (principle <= 10000 && time >= 2) {
            si = principle * time * 0.1;
            System.out.println("Simple Interest:" + si);
        } else if (principle > 10000) {
            si = principle * time * 0.11;
            System.out.println("Simple Interest:" + si);
        }
        sc.close();

    }

}
