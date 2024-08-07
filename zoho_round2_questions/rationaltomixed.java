package zoho_round2_questions;
import java.util.*;
/*
Given a rational number,print its corresponding equivalent mixed fraction representation
ip: 2.5 op:2 1/2
 */
public class rationaltomixed {
    public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        double input = 6.00;
        System.out.println(100%25);

        //output: 6 1/2
        int wholepart = (int) input;
        double fractionalpart = input - wholepart;

        if(fractionalpart == 0){
            System.out.println( wholepart );
        }

        int denominator = 1;
        while(fractionalpart!=Math.floor(fractionalpart)){
            fractionalpart*=10;
            denominator*=10;
        }

        int numerator = (int) fractionalpart;

        int gcd = gcd(numerator,denominator);
        numerator/=gcd;
        denominator/=gcd;

        System.out.println(wholepart+" "+numerator+"/"+denominator);

    }
}
