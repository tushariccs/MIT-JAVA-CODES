package Part2;

public class Q1 {

    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        char symbol = args[1].charAt(0);
        int num2 = Integer.parseInt(args[2]);
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = ");
        if (symbol == '+') {
            System.out.println(num1 + num2);
        } else if (symbol == '-') {
            System.out.println(num1 - num2);
        } else if (symbol == '*') {
            System.out.println(num1 * num2);
        } else if (symbol == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("You have entered an invalid operator.");
        }

    }

}
