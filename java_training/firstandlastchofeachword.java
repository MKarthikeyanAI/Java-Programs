package java_training;
import java.util.*;
//Capitilize the first and last word of each string in the sentence
public class firstandlastchofeachword {

    static String firstandlast(String str){
        char[] ch = str.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            int k = i;
            //k stores the first character of each word
            //i stores the last character of each word
            while(i<ch.length && ch[i]!=' ')
            {
                i++;
            }
            ch[k]= (char) (ch[k]>='a' && ch[k]<='z' ? ((int)ch[k]-32) :(int) ch[k]);

            ch[i-1] = (char) (ch[i-1]>='a' && ch[i-1]<='z' ? ((int)ch[i-1]-32) :(int) ch[i-1]);
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.nextLine();
        String s = firstandlast(str);
        System.out.println("Result: "+s);
    }
}
