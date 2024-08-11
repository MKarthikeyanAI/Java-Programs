package Patterns;

public class LeftJustified {
    public static void main(String[] args) {
        int s;

        //Triangle rombus
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10-i;j++){
                System.out.print(" ");
            }
            for(s=1;s<=i;s++){
                System.out.print(s);
            }
            for(int m = i-1;m>=1;m--){
                System.out.print(m);
            }
            System.out.println();
        }
        for(int i=10;i>=1;i--){
            for(int j=10-i;j<=i;j--){
                System.out.print(" ");
            }
            for(s=1;s<=i;s++){
                System.out.print(s);
            }
            for(int m = i-1;m>=1;m--){
                System.out.print(m);
            }
            System.out.println();
        }
        //Triangle half 123 and ABC
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10-i;j++){
                System.out.print(" ");
            }
            for(s=1;s<=i;s++){
                System.out.print(s);
            }
            for(int m = i-1;m>=1;m--){
                System.out.print((char)(65+m-1));
            }
            System.out.println();
        }
        //Triangle 123
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10-i;j++){
                System.out.print(" ");
            }
            for(s=1;s<=i;s++){
                System.out.print(s);
            }
            for(int m = i-1;m>=1;m--){
                System.out.print(m);
            }
            System.out.println();
        }
        //Triangle 123 pattern
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10-i;j++){
                System.out.print(" ");
            }
            for(s=1;s<=i;s++){
                System.out.print(s+" ");
            }
            System.out.println();
        }
        //Right justified
        for(int i=1;i<=10;i++){
            for(int j=1;j<=10-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Left justified
        for(int i=1;i<=10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
