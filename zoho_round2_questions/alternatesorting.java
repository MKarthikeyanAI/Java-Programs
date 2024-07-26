package zoho_round2_questions;
import java.util.*;

/*
Sample Input: Alternate Sorting

input: {1,2,3,4,5,6,7}
output: {7,1,6,2,5,3,4}

 */
public class alternatesorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
        }

        int start=0;
        int end=n-1;

        int[] result=new int[n];
        //Populate the new array alternately from the both the ends of the sorted array

        for(int i=0;i<n;i++){
            if(i%2==0){
                result[i]=arr[end];
                end--;
            }
            else{
                result[i]=arr[start];
                start++;
            }
        }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
    }
}
