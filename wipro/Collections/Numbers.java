package wipro.Collections;
import java.util.*;
public class Numbers {
    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10); // int
        numbers.add(20.5); // double
        numbers.add(30.5f); // float

//        numbers.add("Hello"); // Compile-time error: String is not a Number

        System.out.println(numbers);
    }


}
