package java_training;

public class tested {
    public static void main(String[] args) {

        String a = "amazon";
        String b = "noamaz";

        if (a.length() != b.length()) {
            System.out.println("false");
        }

        if (a.length() < 2) {
            System.out.println("false");
        }

        String leftRotated = a.substring(2) + a.substring(0, 2);

        System.out.println(leftRotated);

        String rightRotated = a.substring(a.length() - 2) + a.substring(0, a.length() - 2);

        System.out.println(rightRotated);

    }
}