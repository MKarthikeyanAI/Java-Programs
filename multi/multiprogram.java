package multi;

public class multiprogram {
    int a,b,c;
    public multiprogram(int a1,int b1)
    {
        a=a1;
        b=b1;
    }
    public void pro()
    {
        c=a*b;
    }
    public void display(){
        System.out.println("Output of the program: "+c);
    }
}
