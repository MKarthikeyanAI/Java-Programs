import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        String str = "";
        String reversedStr = "";
        Scanner din  = new Scanner(System.in);
        System.out.println("Eneter a string : ");
        str = din.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
