package Top100PrepInstaQuestions;
import java.util.*;
public class perfectnumber {
    static void perfect(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0)
            {
                sum+=i;
            }
        }
        if(sum==n)
        {
            System.out.println("Its the Perfect Number");
        }
        else
        {
            System.out.println("Its Not the Perfect Number");
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        perfect(n);
    }
}
