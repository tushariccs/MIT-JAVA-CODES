package Interface;

import java.util.Scanner;

abstract class Person {
    String address, ename;
    int eno;
}

class Employee extends Person {
    // Scanner sc = new Scanner(System.in);
    String ename, address;
    int eno;

    void accept(String ename, String address, int eno) {
        this.ename = ename;
        this.address = address;
        this.eno = eno;

    }

    void display() {
        System.out.println("Address of Employee:" + address);
        System.out.println("Employee number" + eno);
        System.out.println("Employee name" + ename);
    }

}

class Worker extends Person {
    String ename, address;
    int eno;

    void accept(String ename, String address, int eno) {
        this.ename = ename;
        this.address = address;
        this.eno = eno;
    }

    void display() {
        System.out.println("Address of Worker:" + address);
        System.out.println("Worker number" + eno);
        System.out.println("Worker name" + ename);
    }

}

public class Abstract1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // For Employee
        // System.out.println("Enter the employee details");
        // String a = sc.nextLine();
        // String b = sc.nextLine();
        // int no = sc.nextInt();
        // For Worker
        // System.out.println("Enter the Worker details");
        // String c = sc.nextLine();
        // String d = sc.nextLine();
        // int no1 = sc.nextInt();

        Employee e = new Employee();
        Worker w = new Worker();

        System.out.println("Choice:");
        int no2 = sc.nextInt();

        switch (no2) {
            case 1:
                // For Employee
                System.out.println("Enter the employee details");
                String a = sc.nextLine();
                String b = sc.nextLine();
                int no = sc.nextInt();
                e.accept(a, b, no);
                e.display();
                break;
            case 2:
                // For Worker
                System.out.println("Enter the Worker details");
                String c = sc.nextLine();
                String d = sc.nextLine();
                int no1 = sc.nextInt();

                w.accept(c, d, no1);
                w.display();
                break;
            default:
                System.out.println("Wrong option");

        }
        sc.close();
    }

}
