import java.util.Scanner;

public class Employee {
    //variables to store value in the constructor
    private String myName;
   private int myEmployeeId;
    private double myWage;//salary
    private boolean isFullTime;
    //Employee Constructor for accepting values
    Employee(String myName,int myEmployeeId,double myWage,boolean isFullTime)//Formal Parameters
    {
        this.myName = myName;
        this.myEmployeeId = myEmployeeId;
        this.myWage = myWage;
        this.isFullTime = isFullTime;
       // System.out.println(myName);
    }
    public String accesor()//calls Employee name
    {
        return getName();
    }
    public  String getName(){
        //used for accesor to return name of the employee
        return myName;
    }
    public int mutator()// call setEmployeeId
    {
        return setEmployeeId();
    }
    public int setEmployeeId()
    {// returns the employee id to mutator
        return myEmployeeId;
    }
    public double Wage()
    {
        return getMyWage();
    }
public double getMyWage()
{
    return myWage;
}
public void printDetails()
{
    //System.out.println("The name of the employee is" +myName+"The employee id is"+myEmployeeId+"The wage of the employee is"+myWage+"per hour");
    if(isFullTime==true)
    {
//        System.out.println("The name of the employee is " +myName+".The employee id is"+myEmployeeId+".The wage of the employee is"+myWage+".per hour"+"The employee is fulltime.");
    }
    else {
        System.out.println("The name of the employee is " +myName+".The employee id is "+myEmployeeId+".The wage of the employee is "+myWage+".per hour"+"The employee is not fulltime.");
    }
}
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details as follow:");
        System.out.println("Enter the name of the Employee:");
        String myName = sc.nextLine();
        System.out.println("Enter the EmployeeId:");
        int myEmployeeId = sc.nextInt();
        System.out.println("Enter the Employee's wage:");
        double myWage = sc.nextDouble();
        System.out.println("Enter the employee work Fulltime:");//True or False
        boolean Fulltime = sc.nextBoolean();


Employee e = new Employee(myName,myEmployeeId,myWage,Fulltime);//actual parameters
        //calls parameterized constructor
        e.accesor();
        e.mutator();
        e.Wage();
        e.printDetails();

    }
}
