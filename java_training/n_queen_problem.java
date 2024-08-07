package java_training;

public class n_queen_problem {
    static int iteration = 0;
    static boolean ans = false;
    static boolean validate(int row,int col,char board[][],int n){
        //same row
        for(int i=0;i<col;i++){
            if(board[row][i]=='Q'){
                return false;
            }
        }
        //bottom diagonal
        for(int i=1;(row+i)<n && (col-i)>=0;i++){
            if(board[row+i][col-i]=='Q'){
                return false;
            }
        }

        //upper diagonal
        for(int i=1;(row-i)>=0 && (col-i)>=0;i++){
            if(board[row-i][col-i]=='Q'){
                return false;
            }
        }
        return true;
    }

    static void n_queens(int col,char board[][],int n){
        if(col==n){
            display(board,n);
            return;
        }

        for(int i=0;i<n;i++){
            board[i][col]='Q';
            if(validate(i,col,board,n)){
                n_queens(col+1,board,n);
            }
            board[i][col]='.';
        }
    }
    static void display(char[][] board,int n){
        System.out.println("_____________________________________________________");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void update(char[][] board,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]= '.';
            };
        }
    }

    public static void main(String args[]){
        int n=2;
        char board[][] = new char[n][n];
        update(board,n);
        n_queens(0,board,n);
        display(board,n);
        if(ans == false){
            System.out.println("Not Possible");
        }
    }
}
