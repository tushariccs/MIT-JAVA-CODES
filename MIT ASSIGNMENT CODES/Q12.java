public class Q12 {
    public static void main(String args[])
    {
        String x = "Tushar is a good boy DOB:24/02/2001";
        count(x);
    }
    public static void count(String x)
    {
        char[] ch = x.toCharArray();

        int letter = 0;
        int space = 0;
        int num=0;
        int other=0;
        for(int i=0;i<x.length();i++)
        {
            if(Character.isLetter(ch[i]))
            {
                letter++;
            }
            else if(Character.isDigit(ch[i]))
            {
                num++;
            }
            else if(Character.isSpaceChar(ch[i]))
            {
                space++;
            }
            else {
                other++;
            }
        }
        System.out.println("The string is:");
        System.out.println("Letter"+letter);
        System.out.println("Number"+num);
        System.out.println("Space"+space);
        System.out.println("other"+other);

    }
}
