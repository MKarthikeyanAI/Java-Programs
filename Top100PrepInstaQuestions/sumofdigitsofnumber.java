package Top100PrepInstaQuestions;

import java.util.Scanner;
/*
Example
Input : 1234
Output : 1 + 2 + 3 + 4 = 10
 */
public class sumofdigitsofnumber {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        while(n!=0)
        {
            sum=sum+(n%10);
            n = n/10;
        }
        System.out.println("Ans: "+sum);
    }
}
