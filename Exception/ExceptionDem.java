import java.util.Scanner;

class OvelException extends Exception {
    OvelException(String msg) {
        super(msg);
    }

    public class ExceptionDem {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string: ");

            try {
                String str = sc.nextLine();
                int len = str.length();
                for (int i = 0; i < len; i++) {
                    char ch = str.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'
                            || ch == 'I' || ch == 'O' || ch == 'U') {
                        throw new OvelException("String contain oval,Don't enter ovel");
                    }
                }
                System.out.println();
                System.out.println("Reverse order: ");
                for (int j = len - 1; j >= 0; j--) {
                    char c = str.charAt(j);
                    System.out.print("\t" + c);
                }

            } catch (OvelException e) {
                System.out.println(e);
            }
        }
    }
}