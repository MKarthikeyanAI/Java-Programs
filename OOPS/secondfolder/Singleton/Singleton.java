package OOPS.secondfolder.Singleton;

/*
a singleton is a design pattern that ensures a class has only one instance and provides a global point of access to it. 
 */
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        //check whether 1 obj only is created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
