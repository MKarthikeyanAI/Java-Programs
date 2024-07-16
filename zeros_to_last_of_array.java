import java.util.*;

public class zeros_to_last_of_array {

    static void pushZerostoEnd(int arr[],int n)
    {
        int count =0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }

        while(count<n)
        {
            arr[count]=0;
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the Array:");

        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the Array:");

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        pushZerostoEnd(arr,size);

        System.out.println("After Pushing all the Zeros to the back");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
