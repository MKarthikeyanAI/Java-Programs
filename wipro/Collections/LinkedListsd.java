package wipro.Collections;

import java.util.*;

public class LinkedListsd {
    public static void main(String[] args) {
        // Create an ArrayList to store the months of the year
        LinkedList<String> months = new LinkedList();

        // Add all months of the year to the ArrayList
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        // Print the contents of the ArrayList
        System.out.println("Months of the Year:");
        for (String month : months) {
            System.out.println(month);
        }
    }
}
