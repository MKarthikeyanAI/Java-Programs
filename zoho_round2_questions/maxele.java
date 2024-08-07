package zoho_round2_questions;

import java.util.*;
/*
Given an array of integers, compute the maximum value for each integer in the index, by either summing all the digits or multiplying all the digits. (Choose which operation gives the maximum value)

Input:

5

120 24 71 10 59

Output:

388 1 45

Explanation: For index 0, the integer is 120. Summing the digits will give 3, and whereas Multiplying the digits gives 0. Thus, maximum of this two is 3
 */
public class maxele {
    public static void main(String[] args) {
        int[] arr = {120 ,24 ,71 ,10 ,59};
        int[] result = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int sum=0;
            int prod=1;
            int num = arr[i];
            while(num!=0){
                int rem = num%10;
                sum+=rem;
                prod*=rem;
                num=num/10;
            }
            int res = Math.max(sum,prod);
            result[i]=res;
        }

        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
