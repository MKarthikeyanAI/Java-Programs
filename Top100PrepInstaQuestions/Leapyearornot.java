package Top100PrepInstaQuestions;

import java.util.Scanner;

public class Leapyearornot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = in.nextInt();
        if(year%400==0 ||(year%4==0 && year%100!=0))
        {
            System.out.println("It is a Leap Year");
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
