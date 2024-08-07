package zoho_round2_questions;
/*
Given an array, the distance between two array values is the number of indices between them.
Find the minimum distance between any pair of equal elements in the array If no such value exists, return -1.
 */

import java.util.*;
public class arrayindices {
    public static void main(String[] args) {
//        int[] arr = {7,1,3,4,1,7};
        int[] arr = {7,1,2,3,4,10};

        int min = Integer.MAX_VALUE;

        int i=0,j=arr.length-1;

        while(i<j){
            if(arr[i]==arr[j]){
                int curr = j-i;
                min = Math.min(min,curr);
                System.out.println(min);
                i++;
                j--;
            }
            else{
                i++;
            }
        }

        if(min == Integer.MAX_VALUE){
            System.out.println("-1");
        }
        else
        {
            System.out.println(min);
        }
    }
}
