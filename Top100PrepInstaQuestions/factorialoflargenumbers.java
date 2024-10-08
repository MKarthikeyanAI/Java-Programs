package Top100PrepInstaQuestions;

import java.util.Scanner;

public class factorialoflargenumbers {
    static void factorial(int n)
    {
        int[] res = new int[500];

        int res_size=1;
        res[0]=1;
        for(int x=2;x<=n;x++)
        {
            res_size = multiply(x,res,res_size);
        }
        for(int j=res_size-1;j>=0;j--)
        {
            System.out.print(res[j]);
        }
    }
    static int multiply(int x,int[] res,int res_size)
    {
        int carry=0;
        for(int i=0;i<res_size;i++)
        {
            int prod = x*res[i]+carry;
            res[i]=prod%10;
            carry = prod/10;
        }
        while(carry!=0){
            res[res_size]=carry%10;
            carry = carry/10;
            res_size++;
        }
        return res_size;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        factorial(n);
    }
}
