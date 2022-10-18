import java.util.Scanner;

class InvalidEmailException extends Exception {
    String str;

    InvalidEmailException(String str) {
        this.str = str;
        System.out.println("Error Occurred......." + str);
        toString();
    }

    public String toString() {
        return "InvalidEmailException";
    }
}

public class ExceptionQ2 {
    String email;

    public void validate(String email) throws InvalidEmailException {
        this.email = email;

        if (Character.isDigit(email.charAt(0))) {
            throw new InvalidEmailException("Email not start number");
        }
        for (int i = 0; i < email.length(); i++) {
            if ((email.charAt(i) == '@')) {
                System.out.println("Email is valid");
            }
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the email address: ");
            String email = sc.nextLine();
            ExceptionQ2 e1 = new ExceptionQ2();
            e1.validate(email);
        } catch (InvalidEmailException e) {
            System.out.println(e);

        }
        // catch (InvalidEmailException e) {

        // }

    }

}
