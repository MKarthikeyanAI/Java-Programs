package Top100PrepInstaQuestions;

import java.util.Scanner;

/*
Check Whether or Not the Number is an Armstrong Number
Given an integer input, the objective is to check whether or not the number input is an Armstrong number or not.

However, Armstrong number is any number following the given rule –

abcd… = an + bn + cn + dn + …
Where n is the order(length/digits in number)
Also check – Armstrong Number in a given Range in Java
 */
public class Amstrong {
    static int findlength(int n)
    {
        int length=0;

        while(n!=0)
        {
            length++;
            n=n/10;
        }
        return length;
    }
    static boolean checkamstrong(int n,int length)
    {
        int sum=0;
        int temp=n;
        int digit;
        while(temp!=0)
        {
            digit = temp%10;
            sum = sum+(int)Math.pow(digit,length);
            temp = temp/10;
        }
        if(sum == n)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int length = findlength(n);
        boolean s = checkamstrong(n,length);
        if(s)
        {
            System.out.println(n+" is the Amstrong Number");
        }
        else
        {
            System.out.println(n+" is not the Amstrong Number");
        }
    }
}
