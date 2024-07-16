class add
{
    int a,b,c,d1;
    String nh;
    add()
    {
        a=10;
        b=45;
        c=a+b;
    }
    add(int d)
    {
        a=5;
        b=543;
        d1=d;
        c=a+b+d1;
    }
    add(String name)
    {
        nh=name;
    }
    void display()
    {
        System.out.println("Output: "+c);
        System.out.println("Output: "+nh);
    }
}
public class constructorprogram {
    public static void main(String[] args) {
        int d=20;
        String name="mk";
        add a1=new add();
        a1.display();
        add a2=new add(d);
        a2.display();
        add a3=new add(name);
        a3.display();
      }
}
