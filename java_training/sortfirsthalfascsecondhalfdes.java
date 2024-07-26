package java_training;
import java.util.*;
public class sortfirsthalfascsecondhalfdes {
    static void sorting(int[] arr,int n){
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++)
        {
            System.out.print(arr[i]+" ");;
        }
        for(int j=n-1;j>=n/2;j--)
        {
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        sorting(arr,n);
    }
}
