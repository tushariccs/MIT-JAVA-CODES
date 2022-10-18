import java.util.*;

class InvalidException extends Exception {
    String str;

    public InvalidException(String str) {
        this.str = str;
        System.out.println("Exception occured...." + str);
        toString();
    }

    public String toString() {
        return "Exception at InvalidException[" + str + "]";
    }
}

public class ExceptionDemo {

    static void validate(int age) throws InvalidException {
        int age1 = age;
        if (age1 < 18) {
            throw new InvalidException("age is not appropriate");
        } else {
            System.out.println("Your age is valid");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age");
            int n = sc.nextInt();
            validate(n);
        } catch (InvalidException e) {
            System.out.println(e);
        } finally {
            System.out.println("Code running...");
        }

    }

}
