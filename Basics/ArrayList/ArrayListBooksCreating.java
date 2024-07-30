package Basics.ArrayList;

//Let's see an ArrayList example where we are adding books to the list and printing all the books.

//The book contains id,name,author,publisher,quantity
import java.util.*;
class book{
    int id;
    String name,author,publisher;
    int quantity;

    public book(int id,String name,String author,String publisher,int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}
public class ArrayListBooksCreating {


    public static void main(String[] args) {
        ArrayList<book> list = new ArrayList<book>();

        Scanner in = new Scanner(System.in);

        while(true){
            int id = in.nextInt();
            in.nextLine(); // Consume newline character
            String name= in.nextLine();
            String author = in.nextLine();
            String publisher = in.nextLine();
            int quantity = in.nextInt();
            in.nextLine(); // Consume newline character


            book b1 = new book(id,name,author,publisher,quantity);

            list.add(b1);

            System.out.println("If you add the book enter 1:");
            int s = in.nextInt();

            if(s!=1){
                break;
            }
        }


        for(book b:list){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
