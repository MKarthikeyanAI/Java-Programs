package Top100PrepInstaQuestions;
/*
Find the Greatest of the Two Numbers in Java
Given two integer input Number1 and Number2, the objective is to write a Java code to compare both the Numbers and Find the Greatest of the Two Numbers. To do so we’ll use if-else statements and print the output. Some methods to solve the above-mentioned Problem are given below.

Method 1: Using if-else Statements
Method 2: Using Ternary Operator
Method 3: Using inbuilt max Function
 */
import java.util.Scanner;

public class greatestoftwonumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no.1: ");
        int a = in.nextInt();
        System.out.println("Enter no.2: ");
        int b = in.nextInt();
        //Method 2
        if(a==b)
        {
            System.out.println("Both are equal");
        }
        else
        {
            int c = a>b?a:b;
            System.out.println(c+" is the greater number");
        }
        //Method 3
        System.out.println(Math.max(a,b));

        //Method 1
        int num1 = 50, num2 = 20;
        if (num1 == num2)
            System.out.println ("both are equal");
        else if (num1 > num2)
            System.out.println (num1 + " is greater");

        else
            System.out.println (num2 + " is greater");
    }
}
