package Top100PrepInstaQuestions;
import java.util.*;


public class primegivenrange {

    public boolean prime(int n)
    {
        if(n<2)
            return false;

        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        primegivenrange o = new primegivenrange();

        for(int i=start;i<=end;i++)
        {
            if(o.prime(i))
                System.out.println(i);
        }
    }
}
