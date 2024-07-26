package Top100PrepInstaQuestions;

import java.util.Scanner;
/*
Example
Input : 121
Output : Palindrome
Reason : reversing the number : 121
 */
public class palindrome {
    public static boolean isPalindrome(String s)
    {
        String reverse = new StringBuilder(s).reverse().toString();
        return s.equals(reverse);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String s = in.next();
        int ans=n;
        int rev=0;
        int rem;
        while(n!=0)
        {
            rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        System.out.println(rev);
        if(rev==ans)
        {
            System.out.println("It is a palindrone number");
        }
        else
        {
            System.out.println("It is not a palindrone number");
        }

        if(isPalindrome(s.toLowerCase()))
        {
            System.out.println("The Given String is Palindrome");
        }
        else
        {
            System.out.println("The Given String is not Palindrome");
        }
    }
}
