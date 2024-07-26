package java_training;
import java.util.*;

public class dectohexadecimal {
    static void dectohex(int n)
    {
        int[] arr=new int[100];
        int i=0;
        while(n!=0)
        {
            arr[i] = n%16;
            n=n/16;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            if(arr[j]>9)
            {
                System.out.print((char)(arr[j]+55));
            }
            else
            {
                System.out.print(arr[j]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        dectohex(n);
    }
}
