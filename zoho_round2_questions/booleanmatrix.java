package zoho_round2_questions;
/*
2. Given a Boolean matrix mat[M][N] of size M X N, modify it such that if a matrix cell mat[i][j] is 1 then make its adjacent cells as 0.
 */

import java.util.*;

public class booleanmatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }

        int rows = arr.length;
        int cols = arr[0].length;

        //Iterate through the matrix
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++){
                //Update Adjacent cells to 0
                if(arr[i][j]==1){
                    if(i-1>=0){
                        arr[i-1][j]=0;//Up
                    }
                    if(i+1<rows){
                        arr[i+1][j]=0;//Down
                    }
                    if(j-1>=0){
                        arr[i][j-1]=0;//Left
                    }
                    if(j+1<cols){
                        arr[i][j+1]=0;//Right
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
