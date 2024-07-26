package Top100PrepInstaQuestions;
import java.util.*;
public class evenorodd {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String result = n%2==0?"the number is even":"the number is odd";
        System.out.println(result);

    }
}

