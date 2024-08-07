package Strings;
import java.util.*;
public class basic {
    public static void main(String[] args) {


        String S = "abcdefg";
        List<String> k = new ArrayList<String>();
        int n=S.length();

        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        StringBuilder s3=new StringBuilder();

        for(int i=0;i<n;i++){
            char ch = S.charAt(i);

            if((ch>=97 && ch<=122)||(ch>=65 && ch<=90)){
                s1.append(S.charAt(i));
            }
            else if(ch>='0' && ch<='9'){
                s2.append(S.charAt(i));
            }
            else{
                s3.append(S.charAt(i));
            }
        }


        if(s1.length()!=0){
            k.add(s1.toString());
        }
        if(s2.length()!=0){
            k.add(s2.toString());
        }
        if(s3.length()!=0){
            k.add(s3.toString());
        }
        System.out.println(k);

        String s = "Learn Share Learn";
        int output = s.indexOf("Sah"); // returns 6
        System.out.println(output);
    }
}
