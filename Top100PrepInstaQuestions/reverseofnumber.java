package Top100PrepInstaQuestions;

import java.util.Scanner;

/*
Find the Reverse of a Number in Java:
Example
Input : 123
Output : 321

 */
public class reverseofnumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int rev=0;
        int rem;
        while(n!=0)
        {
            rem=n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        System.out.println("The Reverse of the Number is: "+rev);
    }
}
