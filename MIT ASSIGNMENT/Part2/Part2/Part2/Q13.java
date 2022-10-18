package Part2;

class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}

class Marks extends Student {
    Marks(int rollno, String name) {
        super(rollno, name);

    }

    int mark;

    public int setMarks(int marks) {
        this.mark = marks;
        return marks;
    }

    public int getMarks() {
        return mark;
    }
}

public class Q13 {
    public static void main(String[] args) {
        Marks m1 = new Marks(2, "Tushar");
        m1.setMarks(500);
        int n = m1.getMarks();
        System.out.println(n);

    }

}
