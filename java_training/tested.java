package java_training;
import java.util.*;
public class tested {
    public static void main(String args[]) {

        ArrayList<Integer> al=new ArrayList<Integer>();
        System.out.println("Initial list of elements: "+al);
        //Adding elements to the end of the list
        al.add(11);
        al.add(12);
        al.add(13);

        ArrayList<Integer> al1=new ArrayList<Integer>();

        al1.add(10);
        al1.add(11);
        al1.add(12);

//        al.addAll(al1);
        al.retainAll(al1);
        System.out.println("After invoking addAll(Collection<? extends E> c) method: "+al);




    }
}
