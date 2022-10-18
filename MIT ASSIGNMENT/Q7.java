import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        char c[] = a.toCharArray();

        int space = 0;
        int num = 0;
        int letter = 0;
        int other = 0;

        for (int i = 0; i < a.length(); i++) {
            if (Character.isLetter(c[i])) {
                letter++;
            } else if (Character.isDigit(c[i])) {
                num++;
            } else if (Character.isSpaceChar(c[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println(letter);
        System.out.println(num);
        System.out.println(space);
        System.out.println(other);
        sc.close();
    }

}
