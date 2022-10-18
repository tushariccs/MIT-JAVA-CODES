package Part2;

import java.util.Scanner;

class employee {
    String Emp_No;
    String Emp_name;
    String Designation;

    employee(String Emp_No, String Emp_name, String Designation) {
        this.Emp_No = Emp_No;
        this.Emp_name = Emp_name;
        this.Designation = Designation;

    }
}

class salary extends employee {

    salary(String Emp_No, String Emp_name, String Designation) {
        super(Emp_No, Emp_name, Designation);

    }

    public double Basic_sal() {
        double hra, da, basic_sal, gross, medical, others, conveyence;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the hra salary:");
        hra = s.nextDouble();
        System.out.println("Enter the basic gross salary");
        gross = s.nextDouble();
        System.out.println("Enter the da salary");
        da = s.nextDouble();
        System.out.println("Enter medical salary");
        medical = s.nextDouble();
        System.out.println("Enter the other");
        others = s.nextDouble();
        System.out.println("Enter the conveyence:");
        conveyence = s.nextDouble();

        basic_sal = -(gross - da - hra - conveyence - medical - others);
        s.close();
        return basic_sal;
        // s.close();
    }

}

public class Q14 {
    public static void main(String[] args) {
        salary s = new salary("1", "Tushar", "Pune");
        double a = s.Basic_sal();
        System.out.println(a);

    }

}
