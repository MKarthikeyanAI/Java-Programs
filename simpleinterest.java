import java.util.Scanner;
public class simpleinterest {
    public static void main(String args[])
    {
        int a;
        int b;
        int c;
        int d;
        Scanner din= new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        a=din.nextInt();
        System.out.println("Enter the Rate of Interest: ");
        b=din.nextInt();
        System.out.println("Enter the Time of Period: ");
        c=din.nextInt();
        d=a*b*c;
        System.out.println("output "+d);
    }
}
