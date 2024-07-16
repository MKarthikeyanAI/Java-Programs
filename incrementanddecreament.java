import java.util.Scanner;
public class incrementanddecreament {
    public static void main(String args[])
    {
        int a;
        int b;
        Scanner din= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a=din.nextInt();
        a++;
        System.out.println("Enter the value of b: ");
        b=din.nextInt();
        b++;
        System.out.println("a increment: "+a);
        System.out.println("b increment: "+b);
        a--;
        b--;
        System.out.println("a increment: "+a);
        System.out.println("b increment: "+b);
    }
    
}
