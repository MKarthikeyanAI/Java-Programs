import java.util.Scanner;

public class ifcondition {
    public static void main(String args[])
    {
        int a;
        Scanner din= new Scanner(System.in);
        System.out.println("Enter the Integer Number: ");
        a=din.nextInt();
        if((a%2==0))
        {
            System.out.println(a+"=Even Number");
        }
        else
        {
            System.out.println(a+"=Odd Number");
        }
    }    
}
