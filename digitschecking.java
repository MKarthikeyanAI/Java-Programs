import java.util.Scanner;
public class digitschecking {
    public static void main(String args[])
    {
        int a;
        Scanner din= new Scanner(System.in);
        System.out.println("Enter the Integer Number: ");
        a=din.nextInt();
        if(a<=9 && a>=-9)
        {
            System.out.println(a+"=Single Digit");
        }
        else if((a<=99 && a>=-99))
        {
            System.out.println(a+"=Two Digit");
        }
        else
        {
            System.out.println(a+"=More than Two Digit");
        }
    } 
}
