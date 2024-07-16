import java.io.*;
import java.util.*;
import java.util.Scanner;
class a1
{
    int a=10,b=30;
    int f,d;
    void read()
    {
        Scanner din=new Scanner(System.in);
        System.out.println("Enter value f: ");
        f=din.nextInt();
        System.out.println("Enter value d: ");
        d=din.nextInt();
    }
    
}
class b1 extends a1
{
    int c,s;
    void pro(){
        c=a+b;
        s=f+d;
    }
    void display()
    {
        System.out.println("Output static: "+c);
        System.out.println("Output dynamic: "+s);
}
}
public class inheritanceexample {
    public static void main(String args[])
    {
        b1 e = new b1();
        e.read();
        e.pro();
        e.display();
    }
}
