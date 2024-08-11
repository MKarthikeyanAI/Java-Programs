package Patterns;
import java.util.*;

public class all_patterns_gfg {
    public static void squarehollowpattern(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void numbertrianglepattern(int n){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void numberincreasingpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void numberincreasingreversepyramidpattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void numberchangingpyramidpattern(int n){
        int sum=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }
    }

    public static void zeroonetrianglepattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else {
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
    }
    public static void palindrometrianglepattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pattern30(int n)
    {
        int row,col;
        for (row=1; row<=n; row++)
        {
            for (int space=n-row; space>=1; space--)
            {
                System.out.print(" ");
            }
            for (col=1; col<=row; col++)
            {
                if(col==10)
                {
                    System.out.print(1);
                }
                else {
                    System.out.print(col+"");
                }
            }
            for (int right=col-2; right>=1; right--)
                System.out.print(right);
            System.out.println();
        }
        int num;
        for (row=1; row<=n-1; row++)
        {
            for (int space=1; space<=row; space++)
            {
                System.out.print(" ");
            }
            for (num=1; num<=n-row; num++)
            {
                System.out.print(num);
            }
            for (int right=num-2; right>=1; right--)
            {
                System.out.print(right);
            }
            System.out.println();
        }

    }

    public static void rhombuspattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int j=n-i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n=6;
        squarehollowpattern(n);
        numbertrianglepattern(n);
        numberincreasingpattern(n);
        pattern30(n);
        numberincreasingreversepyramidpattern(n);
        numberchangingpyramidpattern(n);
        zeroonetrianglepattern(n);
        palindrometrianglepattern(n);
        rhombuspattern(n);

    }
}
