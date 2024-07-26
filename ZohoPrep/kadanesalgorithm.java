package ZohoPrep;
import java.util.*;


public class kadanesalgorithm {
    public static long maxSubarraySum(int[] arr,int n){
        long maxi = Long.MIN_VALUE;
        long sum = 0;

        int start=0;
        int ansStart=-1;
        int ansEnd=-1;

        for(int i=0;i<n;i++){

            //Storing the starting index of maximum index
            if(sum==0){
                start=i;
            }

            sum+=arr[i];

            //if current sum greater than maxi storing the maxi as sum and change the ansEnd to i and ansStart to start;
            if(sum>maxi){
                maxi=sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum<0){
                sum=0;
            }

        }

        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");


        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println();
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
