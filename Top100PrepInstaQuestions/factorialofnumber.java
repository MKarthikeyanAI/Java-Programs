package Top100PrepInstaQuestions;

import java.util.Scanner;

public class factorialofnumber {
    static int fac(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*fac(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        System.out.println("Factorial of a given number: "+fac(n));
    }
}
