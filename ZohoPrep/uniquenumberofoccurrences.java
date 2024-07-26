package ZohoPrep;
/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
Example 1:
Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
 */

import java.util.HashMap;
import java.util.Scanner;

import java.util.*;

public class uniquenumberofoccurrences {
    static void occurences(int[] arr)
    {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set = new HashSet<Integer>(map.values());
        if(map.size()==set.size())
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n= in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        occurences(a);
    }
}
