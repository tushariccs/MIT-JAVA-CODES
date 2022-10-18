import java.util.Scanner;

class InvalidPassword extends Exception {
    InvalidPassword(String str) {
        System.out.println("Error Occured....");
        toString();
    }

    public String toString() {
        return "InvalidPassword";
    }
}

public class ExceptionQ4 {
    String username;
    String password;

    public ExceptionQ4(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean toCheck() throws InvalidPassword {
        if (password.equals(username)) {
            return true;
        } else {
            throw new InvalidPassword("Password Incorrect");
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the password");
            String password = sc.next();
            System.out.println("Enter the username");
            String username = sc.next();
            ExceptionQ4 a = new ExceptionQ4(username, password);
            System.out.println("String is equal then return  " + a.toCheck());
        } catch (InvalidPassword e) {
            System.out.println(e);
        }

    }

}
