public class Methodexample {
    static void checkAge(int age,String name){
        if(age<18){
            System.out.println("Access Denied"+" "+name);
        }
        else {
            System.out.println("Grant Access"+" "+name);
        }
    }
    public static void main(String[] args) {
        checkAge(17,"Ram");
    }
}
