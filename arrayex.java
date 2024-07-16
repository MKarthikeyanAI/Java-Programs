import java.util.Scanner;

public class arrayex {
    public static void main(String args[])
    {
        int sum=0;
        Scanner din=new Scanner(System.in);
        int n;
        n=din.nextInt();
        int [] b=new int[n];
        int[] a={1,2,3,4,5};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(i+": "+a[i]);
        }
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=din.nextInt();
            sum=sum+a[i];
        }
        System.out.println("Sum of the elements: "+sum);
    }  
}
