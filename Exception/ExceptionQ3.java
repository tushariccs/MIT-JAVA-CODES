import java.util.Scanner;

class UserException extends Exception {
    UserException(String str) {
        System.out.println(str);
        toString();

    }

    public String toString() {
        return "UserException";
    }
}

public class ExceptionQ3 {
    int itemcode;
    String description;
    int quantity;
    double rate;

    public ExceptionQ3(int itemcode, String description, int quantity, double rate) {
        this.itemcode = itemcode;
        this.description = description;
        this.quantity = quantity;
        this.rate = rate;

    }

    public void toCheck() throws UserException {
        if (rate <= 0) {
            throw new UserException("Error occured");
        }

    }

    public void display() {
        System.out.println(itemcode);
        System.out.println(description);
        System.out.println(quantity);
        System.out.println(rate);
    }

    public static void main(String[] args) {
        try {
            int itemcode;
            String description;
            int quantity;
            double rate;
            for (int i = 0; i < 4; i++) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the details: ");
                System.out.println("Enter the itemcode");
                itemcode = sc.nextInt();
                System.out.println("Enter the description");
                description = sc.next();
                System.out.println("Enter the quantity");
                quantity = sc.nextInt();
                System.out.println("Enter the rate");
                rate = sc.nextDouble();
                ExceptionQ3 arr[];
                arr = new ExceptionQ3[50];
                arr[0] = new ExceptionQ3(itemcode, description, quantity, rate);
                arr[1] = new ExceptionQ3(itemcode, description, quantity, rate);
                arr[2] = new ExceptionQ3(itemcode, description, quantity, rate);
                arr[3] = new ExceptionQ3(itemcode, description, quantity, rate);

                arr[0].toCheck();
                arr[1].toCheck();
                arr[2].toCheck();
                arr[3].toCheck();

                arr[0].display();
                arr[1].display();
                arr[2].display();
                arr[3].display();

                sc.close();

            }
        } catch (UserException e) {
            System.out.println(e);
        }

    }

}
