package zoho_round2_questions;

import java.util.Scanner;
import java.util.*;

/*
1. adding a digit to all the digits of a number eg digit=4, number = 2875, o/p= 612119
 */
public class digitadding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();

        int digit = in.nextInt();

        String numString = Integer.toString(number);
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<numString.length();i++){
            int digitvalue = Character.getNumericValue(numString.charAt(i));

            int newdigitvalue = digitvalue+digit;

            sb.append(newdigitvalue);
        }
        System.out.println("Output: "+Integer.parseInt(sb.toString()));
    }
}
