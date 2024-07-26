package Top100PrepInstaQuestions;
import java.util.*;
public class greatestofthreenumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no.1: ");
        int a = in.nextInt();
        System.out.println("Enter no.2: ");
        int b = in.nextInt();
        System.out.println("Enter no.3: ");
        int c = in.nextInt();

        if(a>=b && a>=c)
        {
            System.out.println(a+" is the greatest number");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b+" is the greatest number");
        }
        else {
            System.out.println(c+" is the greatest number");
        }
    }
}
