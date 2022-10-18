class EvenOrOdd {
    public void Even() {
        int no = 1;
        for (no = 1; no <= 20; no++) {
            if (no % 2 == 0) {
                System.out.println("Even no: " + no);
            }

        }
    }

    public void Odd() {
        int no = 1;
        for (no = 1; no <= 20; no++) {
            if (no % 2 == 1) {
                System.out.println("Odd no: " + no);
            }

        }

    }
}

class Hii extends EvenOrOdd {
    {

        super.Even();
        super.Odd();
    }
}

public class Q8 {
    public static void main(String[] args) {

        Hii hi = new Hii();

    }

}
