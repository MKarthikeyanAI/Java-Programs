package Top_100_DSA_Problems_gfg;
import java.util.*;

public class best_time_to_buy_sell_stock {
    public int maxProfit(int[] arr)
    {
        int n=arr.length;
        int dp[][] = new int[n][2];

        dp[0][0]= -arr[0];
        //Initialize the maximum profit as 0 if the array is in decreasing order print the max profit as 0.
        dp[0][1]=0;
        for(int i=1;i<n;i++)
        {
            //Buy the Stock at the lowest Price and to store that value:
            dp[i][0]=Math.max(dp[i-1][0],-arr[i]);
            //Sell the Stock at the Highest Price and to store that maximum profit:
            dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]+arr[i]);
        }

        return Math.max(dp[n-1][0],dp[n-1][1]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        best_time_to_buy_sell_stock o = new best_time_to_buy_sell_stock();
        System.out.println("Enter the Limit: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Maximum Profit: "+o.maxProfit(arr));
    }
}
