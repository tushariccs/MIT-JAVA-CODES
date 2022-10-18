import java.util.Scanner;

class NegativeException extends Exception {
    NegativeException(String str) {
        System.out.println(str);
        toString();
    }

    public String toString() {
        return "Error Ocurred....";
    }
}

public class ExceptionQ6 {
    public static void toCheck(int n) throws NegativeException {
        if (n < 0) {
            throw new NegativeException("Negative Exception");
        } else {
            System.out.printf("Number is +ve");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Enter a number: ");
            int n = sc.nextInt();
            toCheck(n);
            sc.close();
        } catch (NegativeException e) {
            System.out.println(e);
        }
    }

}
