import java.util.Scanner;

class student
{
    String name;
    int id;

}
class student1
{
    String name = "MK THE KING";
    int id = 42;
}
class student2
{
    String name = "MK THE KING THE LIFE OF STORY";
    int id = 22;
    void display()
    {
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
}
class student3
{
    String name;
    int id;
    void display()
    {
        Scanner din=new Scanner(System.in);
        name = din.nextLine();
        id = din.nextInt();
        System.out.println("Id:"+id);
        System.out.println("Name:"+name);
    }
}


public class Main {
  public static void main(String[] args) {
    student s = new student();
    System.out.println("Id:"+s.id);
    System.out.println("Name:"+s.name);
    System.out.println("\n");
    student1 o = new student1();
    System.out.println("Id:"+o.id);
    System.out.println("Name:"+o.name);
    student2 q = new student2();
    q.display();
    student3 qw = new student3();
    qw.display();
  }
}
