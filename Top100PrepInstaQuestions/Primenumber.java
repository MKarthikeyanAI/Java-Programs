package Top100PrepInstaQuestions;
import java.util.*;
public class Primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = in.nextInt();
        boolean isprime = true;

        if(n<2)
        {
            isprime = false;
        }
        else
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    isprime=false;
                    break;
                }
            }
        }
        String result = isprime?"Prime":"Not Prime";
        System.out.println("The Given Number "+n+" is "+result+" number");

    }
}
