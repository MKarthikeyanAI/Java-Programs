package OOPS;

/*
Wrapper Class  => It converts the primitive data types into objects. Example: char - > Character
 */
class A{
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
        System.out.println(this.name);
    }

}
public class WrapperExample {
    public static void main(String[] args) {
        final A kunal = new A("kunal");
        kunal.name = "other name";

        //when a non primitive is final,you cannot reassign it;
    }
}


