public class Student {
    String studentName;
    int studentMarks;
    int assignmentMarks;

    Student(String studentName, int studentMarks, int assignmentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
        this.assignmentMarks = assignmentMarks;

    }

    Student() {
        assignmentMarks = 100;
    }

    public int getMarks() {
        return studentMarks;
    }

    public double accessor() {
        return calculateGrade();
    }

    public int mutator() {
        Student s = new Student();
        int studentMarks = s.getMarks();
        if (assignmentMarks > studentMarks || studentMarks >= 0) {
            return studentMarks;
        } else {
            System.out.println("Marks are either greater than 100 or less than 0");
        }
        return -1;
    }

    public double calculateGrade() {
        Student s = new Student();
        int studentMarks = s.mutator();
        double grade = (studentMarks / assignmentMarks) * 100;
        if (grade < 50) {
            System.out.println("Student marks are less than 50%,so result is failed");
        } else if (grade < 50 && grade > 64) {
            System.out.println("Student's  grade is passed");
        } else if (grade < 65 && grade > 74) {
            System.out.println("Student's grade is credit");
        } else if (grade < 75 && grade > 84) {
            System.out.println("Student's grade is distinct");
        } else if (grade > 85) {
            System.out.println("Student's grade is high distinction");
        }
        return grade;
    }

    public static void main(String[] args) {
        Student s = new Student("Tushar", 15, 30);
        s.mutator();
        s.calculateGrade();
        double a = s.accessor();
        int b = s.getMarks();
        System.out.println(b);
        System.out.println(a);
    }

}
