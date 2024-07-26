package Top100PrepInstaQuestions;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class perfectsquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>=0)
        {
            int sr = (int)Math.sqrt(n);
            if((sr*sr) == n){
                System.out.println("Its the Perfect Square Number");
            }
            else
            {
                System.out.println("Its not the Perfect Square Number");
            }
        }



    }
}
