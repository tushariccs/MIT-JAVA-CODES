import java.util.Scanner;

class InvalidProductException extends Exception {
    String str;

    InvalidProductException(String str) {
        this.str = str;
        System.out.println("Error occured......" + str);
        toString();
    }

    public String toString() {
        return "InvalidProductException";
    }
}

class Product {
    int productcode;
    String productname;
    int weight;

    public Product(int productcode, String productname, int weight) throws InvalidProductException {
        this.productcode = productcode;
        this.productname = productname;
        this.weight = weight;
        if (weight > 100) {
            throw new InvalidProductException("weight is unappropriate");
        } else {
            display();
        }

    }

    public void display() {
        System.out.println("Your productcode is: " + productcode);
        System.out.println("Your productname is: " + productname);
        System.out.println("Your weight is: " + weight);
    }
}

public class ExceptionQ1 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the productcode: ");
            int pcode = sc.nextInt();
            System.out.println("Enter the productname: ");
            String pname = sc.next();
            System.out.println("Enter the weight: ");
            int weight = sc.nextInt();
            Product a = new Product(pcode, pname, weight);
        }

        catch (InvalidProductException e) {
            System.out.println(e);
        }

    }
}
