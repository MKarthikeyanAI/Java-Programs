package ZohoPrep;
/*
Sort all even numbers in ascending order and then sort all odd numbers in descending order.

Examples:

Input: arr[] = {1, 2, 3, 5, 4, 7, 10}
Output: arr[] = {7, 5, 3, 1, 2, 4, 10}

Input: arr[] = {0, 4, 5, 3, 7, 2, 1}
Output: arr[] = {7, 5, 3, 1, 0, 2, 4}


 */

import java.util.*;
public class sortingmethod2 {
    public static void twoWaySort(int[] arr) {
        // To store odd Numbers
        List<Integer> odd = new ArrayList<>();

        // To store Even Numbers
        List<Integer> even = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            // If number is even, push them to the even list
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            }
            // If number is odd, push them to the odd list
            else {
                odd.add(arr[i]);
            }
        }

        // Sort even list in ascending order
        Collections.sort(even);

        // Sort odd list in descending order
        Collections.sort(odd, Collections.reverseOrder());

        int i = 0;

        // First store odd numbers in the array
        for (int j = 0; j < odd.size(); j++) {
            arr[i] = odd.get(j);
            i++;
        }

        // Then store even numbers in the array
        for (int j = 0; j < even.size(); j++) {
            arr[i] = even.get(j);
            i++;
        }

    }
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 7, 5, 4 };
        twoWaySort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
