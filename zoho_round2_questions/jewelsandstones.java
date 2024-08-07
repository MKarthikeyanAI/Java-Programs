package zoho_round2_questions;
import java.util.*;
/*
You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"

Output: 3

Example 2:

Input: jewels = "z", stones = "ZZ"

Output:0
 */
public class jewelsandstones {

    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<Character>();
        int result=0;
        for(char c:jewels.toCharArray()){
            set.add(c);
        }

        for(char i:stones.toCharArray()){
            if(set.contains(i)){
                result++;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String a = "aA";
        String b = "aAAbbbb";
        int res = numJewelsInStones(a,b);
        System.out.println(res);
    }
}
