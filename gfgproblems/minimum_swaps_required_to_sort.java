package gfgproblems;
import java.util.*;
public class minimum_swaps_required_to_sort {
    public static int minSwap(int[] arr) {
        int n = arr.length;
        Pair[] pairs = new Pair[n];

        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(arr[i], i);
        }

        Comparator<Pair> com = new Comparator<Pair>(){
            @Override
            public int compare(Pair a,Pair b){
                //current finish time is greater so sort it
                return a.value-b.value;
            }
        };
        Arrays.sort(pairs,com);

        int swaps = 0;
        for (int i = 0; i < n; i++) {
            if (pairs[i].index == i) {
                continue;
            } else {
                swaps++;
                swap(pairs, i, pairs[i].index);
                i--;
            }
        }

        return swaps;
    }

    public static void swap(Pair[] pairs, int i, int j) {
        Pair temp = pairs[i];
         pairs[i] = pairs[j];
        pairs[j] = temp;
    }

    public static class Pair {
        int value;
        int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2};
        System.out.println(minSwap(arr));
    }

}
