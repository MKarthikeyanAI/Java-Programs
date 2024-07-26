package java_training;
import java.util.*;
public class spiralmatrix {
    static void spiralmatrix(int n,int m,int[][] matrix){
        int top=0,bottom=n-1,left=0,right=m-1;
        while(top<=bottom && left<=right){
            //To print the elements from the left to right
            for(int i=left;i<=right;i++)
            {
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            //To print the elements from the top to bottom
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            //To print the elements from the right to left
            if(top<=bottom)
            {
                for(int i=right;i>=left;--i)
                {
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom--;
            }
            //To print the elements from the bottom to top
            if(left<=right)
            {
                for(int i=bottom;i>=top;--i)
                {
                    System.out.print(matrix[i][left]+" ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = in.nextInt();
        int[][] a= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=in.nextInt();
            }
        }
        spiralmatrix(n,m,a);
    }
}
