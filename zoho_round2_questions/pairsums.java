package zoho_round2_questions;
import java.util.*;
/*
There is a large pile of socks that must be paired by color.
Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 */
public class pairsums {
    public static void main(String[] args) {
        int[] arr ={10,20,20,10,10,30,50,10,20};

        HashSet<Integer> set = new HashSet<>();

        int ans = 0;
        for(int i:arr){
            if(set.contains(i)){
                ans+=1;
                set.remove(i);
            }
            else{
                set.add(i);
            }
        }
        System.out.println(ans);
    }
}
