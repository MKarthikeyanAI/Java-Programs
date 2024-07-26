package ZohoPrep;
import java.util.*;

public class makeadistinctdigitarray {

    public static void main(String[] args) {
        int arr[] = {131, 11, 48};
        HashSet<Integer> set = new HashSet<Integer>();
        int n= arr.length;

        for(int i=0;i<n;i++)
        {
            String s = String.valueOf(arr[i]);
            for(int c:s.toCharArray()){
                set.add(c-'0');
            }
        }

        int[] result = new int[set.size()];
        int k=0;
        for(int ele:set)
        {
            result[k++]=ele;
        }
        for(int i:result)
        {
            System.out.println(i);
        }

    }
}
