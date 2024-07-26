package Top_100_DSA_Problems_gfg;

/*
Pair with given Sum (Two Sum)
Given an array A[] of n numbers and another number x, the task is to check whether or not there exist two elements in A[] whose sum is exactly x.

Examples:

Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation: If we calculate the sum of the output,1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}, x = 0
Output: No

....................

Two Sum using Naive Approach:
The basic approach to solve this problem is by nested traversal.

Traverse the array using a loop
For each element:
Check if there exists another in the array with sum as x
Return true if yes, else continue
If no such pair is found, return false.
 */

import java.util.*;

public class pair_with_given_sum_1 {
    static boolean checkPair(int[] arr,int target,int size){
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }

        int target = in.nextInt();

        if(checkPair(arr, target,size))
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
