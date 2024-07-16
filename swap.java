import java.util.Scanner;
public class swap {
    public static void main(String args[])
    {
        int a;
        int b;
        Scanner din= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a=din.nextInt();
        System.out.println("Enter the value of b: ");
        b=din.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}

