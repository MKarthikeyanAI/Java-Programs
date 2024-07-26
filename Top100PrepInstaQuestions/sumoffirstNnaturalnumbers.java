package Top100PrepInstaQuestions;
/*
Find the Sum of First N Natural Numbers in Java
Given an integer input of N, the objective is to find the sum of all the natural numbers until the given input integer. To do so we can use different approaches to write the Java code and some such methods are mentioned below,

Method 1: Using for Loop
Method 2: Using Formula for the Sum of Nth Term
Method 3: Using Recursion
 */
import java.util.*;

public class sumoffirstNnaturalnumbers {

    //Method 3 recursion method
    public int getSum(int n)
    {
        if(n==0)
        {
            return n;
        }
        else
        {
            return n+getSum(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        sumoffirstNnaturalnumbers o = new sumoffirstNnaturalnumbers();
        System.out.println("Sum of First N Natural Numbers is:"+o.getSum(n));
        int sum=0;
        //Method 1:
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of First N Natural Numbers is:"+sum);
        int s = (n*(n+1))/2;
        System.out.println("The answer of the First N Natural Number is:"+s);
    }
}
