package zoho_round2_questions;
import java.util.*;
/*
Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. For example, in an array A

Example :

Input: A[] = {-7, 1, 5, 2, -4, 3, 0}

Output: 3
 */
public class equalibriumindex {

    public static int equilibriumPoint(int[] arr){
        int n=arr.length;
        int totalsum=0;
        int left=0;
        for(int i:arr){
            totalsum+=i;
        }
        for(int i=0;i<n;i++){
            totalsum-=arr[i];

            if(totalsum == left){
                return i+1;
            }

            left+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int result = equilibriumPoint(arr);
        System.out.println(result);
    }
}
