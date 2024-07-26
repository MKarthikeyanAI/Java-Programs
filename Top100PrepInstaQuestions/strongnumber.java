package Top100PrepInstaQuestions;

import java.util.Scanner;

/*
Strong Number
A Number that can be represented as the sum of the factorial of it's individual digits is known as a Strong Number.
Let's try and understand the concept better using an example

Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.
 */
public class strongnumber {
    static int fact(int n){
        if(n==0)
        {
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
    static boolean strongno(int n)
    {
        int temp=n;
        int sum=0;
        int digit;
        while(n!=0)
        {
            digit = n%10;
            sum = sum+fact(digit);
            n=n/10;
        }
        if(temp==sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean strongnos = strongno(n);
        if(strongnos)
        {
            System.out.println("It is the Strong Number");
        }
        else
        {
            System.out.println("It is not the Strong Number");
        }
    }
}
