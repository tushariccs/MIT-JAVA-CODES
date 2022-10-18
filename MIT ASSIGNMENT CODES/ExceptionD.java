import java.util.*;

public class ExceptionD extends Exception {
    static void arrayOperation() throws ArrayIndexOutOfBoundsException, ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();

        int arr[] = new int[10];
        if (n > arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[5] = 30 / 5;
        if (n == 0) {
            arr[5] = 30 / n;
            throw new ArithmeticException();
        }

    }

    public static void main(String[] args) {
        try {
            arrayOperation();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e1) {
            System.out.println(e1.getMessage());
        } finally {
            System.out.println("Coding running");
        }

    }
}
