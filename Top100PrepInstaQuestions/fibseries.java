package Top100PrepInstaQuestions;
/*
General Formula to find the Nth term of a Series
F0 = 0 and F1 = 1 be the seed values
The Nth term of a Fibonacci series is given as Fn = Fn-1 + Fn-2 .
Example,
Input : 5
Fibonacci Series : 0 1 1 2 3
Explanation:
For 3rd term it's 2nd term + 1st term.
For 4th term it's 3rd term + 2nd term.
for 5th term it's 4th term + 3rd term.
 */

import java.util.*;
public class fibseries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=1;
        int b=1;
        int nextterm;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            nextterm = a+b;
            System.out.print(nextterm+" ");
            a=b;
            b=nextterm;
        }
    }
}
