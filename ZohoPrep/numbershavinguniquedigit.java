package ZohoPrep;
/*
Numbers having Unique (or Distinct) digits:

Given a range, print all numbers having unique digits.

Examples :

Input : 10 20
Output : 10 12 13 14 15 16 17 18 19 20  (Except 11)
Input : 1 10
Output : 1 2 3 4 5 6 7 8 9 10

Approach:

As the problem is pretty simple, the only thing to be done is :-
1- Find the digits one by one and keep marking visited digits.
2- If all digits occurs one time only then print that number.
3- Else not.
 */
import java.util.*;

public class numbershavinguniquedigit {

    //Optimum solution:
    static ArrayList<Integer> uniqueNumbersw(int L,int R) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=L;i<=R;i++)
        {
            String s = String.valueOf(i);

            HashSet<Integer> set = new HashSet<Integer>();
            for(int c:s.toCharArray())
            {
                System.out.println("asdfdf: "+c);
                set.add(c);
            }
            if(s.length()==set.size()){
                result.add(i);
            }
        }
        return result;
    }


    // Method to return unique digit numbers in the range from l to r.
    static ArrayList<Integer> uniqueNumbers(int L, int R) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = L; i <= R; i++) {
            int num = i;
            boolean[] visited = new boolean[10];
            boolean isUnique = true;

            while (num != 0) {
                if (visited[num % 10]) {
                    isUnique = false;
                    break;
                }
                visited[num % 10] = true;
                num = num / 10;
            }

            if (isUnique) {
                result.add(i);
            }
        }

        return result;
    }
    static void unique(int start,int end){

        for(int i=start;i<=end;i++)
        {
            int num=i;
            boolean[] visited = new boolean[10];
            while(num!=0)
            {
                if(visited[num%10])
                {
                    break;
                }
                visited[num%10]=true;
                num=num/10;
            }
            if(num==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Start Number: ");
        int s=in.nextInt();
        System.out.println("Enter the Ending Number: ");
        int e=in.nextInt();
        unique(s,e);

        ArrayList<Integer> uniqueDigitNumbers = uniqueNumbers(s, e);
        System.out.println();
        System.out.println(uniqueDigitNumbers);
        System.out.println();
        ArrayList<Integer> uniqueDigitNumbersw = uniqueNumbersw(s, e);
        System.out.println(uniqueDigitNumbersw);
    }
}
