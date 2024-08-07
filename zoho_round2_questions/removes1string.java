package zoho_round2_questions;
import java.util.*;
/*
Remove all the characters from s1 which is present in s2;
input: s1: "expErlie" s2:"Ex"
output: "eprlie"
 */
public class removes1string {

    public static String removechars(String s1,String s2){
        String result = "";
        HashSet<Character> set = new HashSet<>();
        for(char i:s2.toCharArray()){
            set.add(i);
        }

        for(char i:s1.toCharArray())
        {
            if(!set.contains(i)){
                result+=i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "Expe";
        String s2 = "x";
        String re = removechars(s1,s2);
        System.out.println(re);
    }
}
