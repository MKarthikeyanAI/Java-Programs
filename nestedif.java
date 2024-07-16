import java.util.Scanner;
public class nestedif {
    public static void main(String args[])
    {
        int a,b,c,d,e;
        float f;
        Scanner din= new Scanner(System.in);
        System.out.println("Enter 5 subject marks: ");
        a=din.nextInt();
        b=din.nextInt();
        c=din.nextInt();
        d=din.nextInt();
        e=din.nextInt();
        f=((a+b+c+d+e)/5);

        if(f>=50)
        {
            System.out.println("Pass With");
            if(f>=90)
            {
                System.out.println("A Grade");
            }
            if(f>=80 && f<90)
            {
                System.out.println("B Grade");
            }
            if(f>=70 && f<80)
            {
                System.out.println("C Grade");
            }
            if(f>=60 && f<70)
            {
                System.out.println("D Grade");
            }
            if(f>=50 && f<60)
            {
                System.out.println("E Grade");
            }
        }
        else{
            System.out.println("Fail");
        }
    } 
}
