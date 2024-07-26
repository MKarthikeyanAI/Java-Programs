package Top100PrepInstaQuestions;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class fibnterm {
    static int fib1(int n)
    {
        if(n==1 || n==2)
        {
            return 1;
        }
        else
        {
            int[] arr = new int[n+1];
            arr[1]=1;
            arr[2]=1;
            for(int i=3;i<=n;i++)
            {
                arr[i]=arr[i-1]+arr[i-2];
            }
            return arr[n];
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Solution 1: "+fib1(n));
    }
}
