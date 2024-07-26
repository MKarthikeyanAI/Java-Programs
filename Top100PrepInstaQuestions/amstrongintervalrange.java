package Top100PrepInstaQuestions;

import java.util.Scanner;

public class amstrongintervalrange {
    static int findlength(int n){
        int length = 0;
        while(n!=0)
        {
            length++;
            n=n/10;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startno = in.nextInt();
        int endno = in.nextInt();



        for(int i=startno;i<=endno;i++)
        {
            int length = findlength(i);
            int temp = i;
            int sum = 0;
            int digit;
            while(temp!=0)
            {
                digit = temp%10;
                sum = sum+(int)Math.pow(digit,length);
                temp = temp/10;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }
    }
}
