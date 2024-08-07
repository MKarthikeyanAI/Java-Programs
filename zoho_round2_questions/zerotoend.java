package zoho_round2_questions;
import java.util.*;
/*
Given an array of integers of size n. Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0. After the modification, rearrange the array such that all O's are shifted to the end.

Input: arr[] = {2, 2, 0, 4, 0, 8}

Output: 4 4 8 0 0 0

Input: arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}

Output: 4 2 12 8 0 0 0 0 0 0
 */
public class zerotoend {
    public static int[] zerotoendofarray(int[] arr){
        int[] result = new int[arr.length];

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=0 && arr[i]==arr[i+1]){
                arr[i] = arr[i]*2;
                arr[i+1]=0;
            }
        }
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }
        while (count<arr.length){
            arr[count++]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,5,6};

        int[] result = zerotoendofarray(arr);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}
