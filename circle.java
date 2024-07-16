import java.util.Scanner;
public class circle {
    public static void main(String args[])
    {
        int a;
        double b;
        Scanner din= new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        a=din.nextInt();
        b=a* a* 3.14;
        System.out.println("output "+b);
    }
}
