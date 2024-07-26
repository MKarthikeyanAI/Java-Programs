package java_training;

class Parent{
    int a,b;
    void add(){
        System.out.println(a+b);
    }
    Parent(int a,int b){
        this.a=a;
        this.b=b;
    }
}

class Child extends Parent{//Inheriting the Parent Class to the Child
    Child(int a,int b){
        super(a,b);//
    }
    void sub(){
        System.out.println(a-b);
    }

}
class Checks{
    protected int a=10;
    public void display(){
        System.out.println("Hi");
    }
}
public class inheritance extends Checks {
    public static void main(String[] args) {
        Checks chk = new Checks();
        chk.display();
        System.out.println(chk.a);

        Child ch = new Child(10,50);
        ch.add();
        ch.sub();
        System.out.println(10/3);


    }
}