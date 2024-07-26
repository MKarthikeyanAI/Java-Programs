package General_Problems;

import java.util.Scanner;
import java.util.*;

//using dynamic programming 1 = recursion+memoization
public class fibonacci_dp1 {
    private HashMap<Integer,Integer> memo;
    int result = 0;

    public fibonacci_dp1(){
        memo = new HashMap<>();
        memo.put(1,1);
        memo.put(2,1);
    }
    public int fib(int n){
        if (memo.containsKey(n)){
            return memo.get(n);
        }
        else
        {
            result = fib(n-1)+fib(n-2);
            memo.put(n,result);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        fibonacci_dp1 fibcalc = new fibonacci_dp1();
        System.out.println(fibcalc.fib(n));
    }
}
