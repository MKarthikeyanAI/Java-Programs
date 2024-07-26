package java_training;
//getter and setter method

//To access the private variable securely is called encapsulation:

class Checke{
    private int num;
    private String name;
    public Checke(int val,String nm){
        this.num = val;
        this.name = nm;
    }
    public void setNum(int val){
        this.num=val;
    }
    public int getNum(){
        return num;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
}
public class howtoaccessprivateclass {

    public static void main(String[] args) {
        Checke chk = new Checke(10,"Lilly");
        System.out.println(chk.getNum());
        System.out.println(chk.getName());
    }
}
