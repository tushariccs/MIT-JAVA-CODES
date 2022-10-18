
class NotDivisble extends Exception {
    NotDivisble(String str) {
        System.out.println("Error Occured");
        toString();

    }

    public String toString() {
        return "Not Divisible By 7 ";
    }
}

public class ExceptionQ5 {
    int n;

    ExceptionQ5(int n) {
        this.n = n;
    }

    public void divisibleBy7() throws NotDivisble {
        if (n % 7 == 0) {
            System.out.println("Divisible by 7");

        } else {
            throw new NotDivisble("Not Divisible By 7");
        }
    }

    public static void main(String[] args) {
        try {
            // Scanner sc = new Scanner(System.in);
            // int n = sc.nextInt();
            Integer n = Integer.parseInt(args[0]);

            ExceptionQ5 e = new ExceptionQ5(n);
            e.divisibleBy7();
            // sc.close();
        } catch (NotDivisble e) {
            System.out.println(e);
        }

    }

}
