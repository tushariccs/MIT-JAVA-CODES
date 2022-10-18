public class ExceptionDe extends Exception {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a=" + a);
            System.out.println(b);
            try {

                if (a == 1) {
                    a = a / (a - a);
                }
                if (a == 2) {
                    int arr[] = new int[10];
                    arr[12] = 23;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array is out of bound=" + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero=" + e);
        } finally {
            System.out.println("Code running...");
        }
    }
}
