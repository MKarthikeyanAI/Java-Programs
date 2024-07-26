package Top100PrepInstaQuestions;
/*
Find the Sum of the Numbers in a Given Interval in Java
Given the range as integer input, the objective is to find the Sum of all the Numbers that lay in the given interval using different methods. To do so we basically iterate from the base interval to the final interval and keep adding the number. Here are some of the methods to solve the above mentioned problem in Java Language.

Method 1: Using Brute Force
Method 2: Using the Formula
Method 3: Using Recursion
 */

import java.util.*;

public class sumofnumbersingiveninterval {
    public int sumofinterval(int s,int start,int end)
    {
        if(start>end)
        {
            return s;
        }
        return start+sumofinterval(s,start+1,end);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Start Range: ");
        int starting_number = in.nextInt();
        System.out.println("Enter the End Range: ");
        int ending_number = in.nextInt();
        int sum= 0;

        //Brute Force
        for(int i=starting_number;i<=ending_number;i++)
        {
            sum+=i;
        }
        System.out.println("The result of the output: "+sum);
        int s = 0;
        //Method 2

        sumofnumbersingiveninterval o = new sumofnumbersingiveninterval();
        System.out.println("The result is: "+o.sumofinterval(s,starting_number,ending_number));

    }
}
