package General_Problems;
//using dynamic programming 1 = bottom_up_approach

import java.util.Scanner;
import java.util.*;

public class fibonacci_dp2 {
    public int fib(int n)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=1;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        fibonacci_dp1 fibcalc = new fibonacci_dp1();
        System.out.println(fibcalc.fib(n));
    }
}
