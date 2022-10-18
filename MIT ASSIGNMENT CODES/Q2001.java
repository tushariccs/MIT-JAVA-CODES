class staff{
    String name,dob,desg;
    int salary;
    public staff(String name,String birthdate,String designation,int salary)
    {
        this.name=name;
        this.dob=birthdate;
        this.desg=designation;
        this.salary=salary;
    }
    public void display()
    {
        System.out.println("Name of the staff:"+name);
        System.out.println("Birth date of the staff:"+dob);
        System.out.println("Designation:"+desg);
        System.out.println("Salary:"+salary);
    }
    public void findHighestSalary(staff otherobj)
    {
        if(this.salary> otherobj.salary)
        {
            System.out.println("Highest salary is"+salary);
        }
        else
        {
            System.out.println("nothing");
        }
    }
}
public class Q2001 {
    public static void main(String args[])
    {
        staff s = new staff("Tushar","24 Feb 2001","HR",220000);
        staff s1 = new staff("Nikhil","12 Feb 2001","SE",120000);
        s.display();
        s1.display();
//        if(s.salary>s1.salary)
//        {
//            System.out.println("Highest salary is:"+s.salary);
//        }
//        else {
//            System.out.println("Highest salary is:"+s1.salary);
//        }
            s.findHighestSalary(s1);
    }
}
