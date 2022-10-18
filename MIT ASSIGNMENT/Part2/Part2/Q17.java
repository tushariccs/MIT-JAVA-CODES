import java.util.*;

abstract class Employee {
    abstract void accept();

    abstract void display();

}

class Manager extends Employee {

    Scanner sc = new Scanner(System.in);
    int mid;
    String mname;
    String phonenumber;

    // override
    void accept() {
        System.out.println("Enter the manager id");
        mid = sc.nextInt();
        System.out.println("Manager name");
        mname = sc.next();
        System.out.println("Manager Phone Number");
        phonenumber = sc.next();

    }

    @Override
    void display() {
        System.out.println("Manager Id Number: " + mid);
        System.out.println("Manager Name: " + mname);
        System.out.println("Manager Phone Number: " + phonenumber);
    }
}

class worker extends Employee {
    Scanner sc = new Scanner(System.in);
    String wname;
    String workinghours;

    void accept() {

        System.out.println("Worker name");
        wname = sc.next();
        System.out.println("Worker Phone Number");
        workinghours = sc.next();
    }

    void display() {
        System.out.println("Worker Name: " + wname);
        System.out.println("Worker Working Hours: " + workinghours);
    }
}

public class Q17 {
    public static void main(String[] args) {
        Manager s = new Manager();
        s.accept();
        s.display();

        worker w = new worker();
        w.accept();
        w.display();

    }
}