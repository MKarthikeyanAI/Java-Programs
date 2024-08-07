package java_training;

public class Knight_tour_problem {

    static int nxt_row[] = {1,2,2,1,-1,-2,-2,-1};
    static int nxt_col[] = {2,1,-1,-2,-2,-1,1,2};

    static boolean validate(int row,int col,int board[][],int n){
        return (row>=0 && row<n)&&(col>=0 && col<n)&&(board[row][col]==-1);
    }

    static boolean findpath(int row,int col,int board[][],int n,int s){
        if(s==n*n){
            board[row][col] = s-1;
            return true;
        }

        for(int i=0;i<8;i++){
            int n_row = row+nxt_row[i];
            int n_col = col+nxt_col[i];

            if(validate(n_row,n_col,board,n)){
                board[row][col] = s-1;
                if(findpath(n_row,n_col,board,n,(s+1))){
                    return true;
                }
                else{
                    board[row][col]=-1;
                }
            }
        }
        return false;
    }

    static void update(int board[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]=-1;
            }
        }
    }

    static void display(int board[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(((board[i][j]>=10)? " " : "  ") + board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n=8;
        int board[][] = new int[n][n];
        update(board,n);
        board[0][0]=0;
        if(findpath(0,0,board,n,1)){
            System.out.println("Compiled");
            display(board,n);
        }
        else {
            System.out.println("Not Possible");
        }
    }
}
