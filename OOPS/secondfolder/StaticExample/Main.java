package OOPS.secondfolder.StaticExample;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(18,"Karthikeyan",50000,false);
//        Human rahul = new Human(28,"Muthu",50000,true);
//        Human sunal = new Human(28,"Muthu",50000,true);

        System.out.println(Human.population);
        System.out.println(Human.population);

        greeting();
    }

    static void fun(){
        //Static method call static method only does not call the object method.

        Main obj = new Main();
        obj.gret();
    }

    void gret(){
        System.out.println("Message");
    }
    // we know that something which is not static,belongs to an object:
    static void greeting(){
        System.out.println("Hello Greeting");
    }
}
