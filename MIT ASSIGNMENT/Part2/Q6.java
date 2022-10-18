class Staff {
    String name;
    String DOB;
    String designation;
    int salary;

    public Staff(String name, String DOB, String designation, int salary) {
        this.name = name;
        this.DOB = DOB;
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name of the staff: " + name);
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

public class Q6 {

    public static void main(String[] args) {
        Staff s1 = new Staff("Tushar", "24/02/2001", "Pune", 20000);
        Staff s2 = new Staff("Aditya", "24/02/2002", "Kothrud", 220000);
        s1.display();
        s2.display();

        if (s1.salary > s2.salary) {
            System.out.println("S1 have the highest salary");
        } else {
            System.out.println("s2 have the highest salary");
        }

    }

}
