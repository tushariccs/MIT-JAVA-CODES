import java.util.*;

class MyException extends Exception {
    int a;

    MyException(int a) {
        this.a = a;

    }

    public String toString() {
        return "Exception occured for a with value with a";
    }
}

public class ExceptionDemo {
    public static void compute(int a) throws MyException {
        if (a > 10) {
            System.out.println("Exception: " + a);
            throw new MyException(a);
        } else if (a < 10) {
            System.out.println("Normal Exceution: ");

        }

    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number:");
            int a = sc.nextInt();

            compute(a);

        } catch (MyException e) {
            System.out.println("Exception occurred i.e:" + e);

        }
    }
}