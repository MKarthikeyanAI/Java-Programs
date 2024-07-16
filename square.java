import java.util.Scanner;
public class square {
    public static void main(String args[])
    {
        int a;
        int b;
        int c;
        Scanner din= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a=din.nextInt();
        System.out.println("Enter the value of b: ");
        b=din.nextInt();
        c=a*a+b*b+2*a*b;
        System.out.println("output "+c);
    }
}
