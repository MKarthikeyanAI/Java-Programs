package Top100PrepInstaQuestions;
import java.util.*;
public class positiveornegativenumber {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        if(n==0)
        {
            System.out.println("The number is zero");
        }
        else {
            String result = n>0?"The number is positive":"The number is negative";
            System.out.println(result);
        }

        //Another Method:

        if(n>=0)
        {
            if(n==0)
            {
                System.out.println("The number is Zero");
            }
            else
            {
                System.out.println("The number is positive");
            }
        }
        else {
            System.out.println("The number is negative");
        }

    }
}
