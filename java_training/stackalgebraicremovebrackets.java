package java_training;
import java.util.*;
public class stackalgebraicremovebrackets {
    // Function to simplify the string
    static String simplify(String str)
    {
        int length = str.length();
        char[] res = new char[length];
        Stack<Integer> s = new Stack<>();
        int i=0;
        int index=0;
        s.push(0);
        while(i<length)
        {
            if(str.charAt(i)=='(' && i==0)
            {
                i++;
                continue;
            }
            else if(str.charAt(i)=='+')
            {
                if(s.peek()==0)
                    res[index++]='+';
                if(s.peek()==1)
                    res[index++]='-';
            }
            else if(str.charAt(i)=='-')
            {
                if(s.peek()==0)
                    res[index++]='-';
                if(s.peek()==1)
                    res[index++]='+';
            }
            else if(str.charAt(i)=='(' && i>0)
            {
                if(str.charAt(i-1)=='-'){
                    int x = (s.peek()==1) ?0:1;
                    s.push(x);
                }
                else if(str.charAt(i-1)=='+'){
                    s.push(s.peek());
                }
            }
            else if(str.charAt(i)==')')
            {
                s.pop();
            }
            else {
                res[index++]=str.charAt(i);
            }
            i++;
        }
        return new String(res);
    }
    // Driver program
    public static void main(String[] args)
    {
        String s1 = "(a-(b+c)+d)";
        String s2 = "a-(b-c-(d+e))-f";
        System.out.println(simplify(s1));
        System.out.println(simplify(s2));
    }
}
