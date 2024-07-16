import java.io.*;
import java.util.*;
import java.util.Scanner;

import javax.xml.transform.Source;
class a2
{
    int a,b;
    void read()
    {
        Scanner din=new Scanner(System.in);
        System.out.println("Enter value f: ");
        a=din.nextInt();
        System.out.println("Enter value d: ");
        b=din.nextInt();
    }
    
}
interface b2
{
    public void pro();
}
class c3 extends a2 implements b2
{
    int c;
    public void pro()
    {
        c=a*b;
    }
    void display()
    {
        System.out.println("Output of the program: "+c);
    }
}
public class multipleinheritance {
    public static void main(String args[])
    {
        c3 r = new c3();
        r.read();
        r.pro();
        r.display();
    }
}

