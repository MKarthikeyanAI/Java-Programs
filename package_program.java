import multi.*;
import java.util.*;

public class package_program {
    public static void main(String args[]){
        Scanner din = new Scanner(System.in);
        System.out.println("Enter the a value:");
        int a1=din.nextInt();
        System.out.println("Enter the a value:");
        int b1=din.nextInt();
        multiprogram m = new multiprogram(a1,b1);
        m.pro();
        m.display();
    }
}
