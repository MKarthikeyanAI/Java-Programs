package wipro.Overriding_Polymorphism;

public class TestFruits {
    public static void main(String[] args) {

        Fruit f = new Fruit("Tomato","Soar","nice");
        f.eat();

        // Create an instance of Apple class
        Apple apple = new Apple("Apple", "sweet", "medium");
        // Invoke the eat method
        apple.eat();

        // Create an instance of Orange class
        Orange orange = new Orange("Orange", "tangy", "small");
        // Invoke the eat method
        orange.eat();
    }
}
