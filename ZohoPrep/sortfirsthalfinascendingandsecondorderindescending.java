package ZohoPrep;

import java.util.Scanner;
import java.util.*;

public class sortfirsthalfinascendingandsecondorderindescending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0;i<n/2;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int j=n-1;j>=n/2;j--)
        {
            System.out.print(arr[j]+" ");
        }

    }
}
