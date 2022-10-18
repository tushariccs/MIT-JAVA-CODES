import java.util.*;
class Bank
{
    String customername,Account_no;
    int sal;
    Scanner sc = new Scanner(System.in);
    public Bank(String Cust_name,String Account_no,int balance)
    {
        this.customername=Cust_name;
        this.Account_no=Account_no;
        this.sal=balance;
    }
    public void withdraw()
    {
        //System.out.println("Balance:"+sal);
        int balance=sal;
        System.out.println("Enter the withdraw amount:");
        int with=sc.nextInt();

        sal-=with;

        System.out.println("Amount remaining is"+sal);
    }
    public void deposit()
    {
        int balance=sal;
        System.out.println("Enter the deposit amount:");
        int desp=sc.nextInt();

        sal+=desp;

        System.out.println("Amount remaining is"+sal);
    }
}
public class Q2002 {
    public static void main(String args[])
    {
Bank a = new Bank("Tushar","50000",60000);
Scanner sc = new Scanner(System.in);
System.out.println("1.Deposit \n2.Withdraw");
//a.withdraw();
//a.deposit();
        int b = sc.nextInt();
        switch(b)
        {
            case 1:a.deposit();
            break;
            case 2:a.withdraw();
            break;
        }
    }
}
