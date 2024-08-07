package Patterns;

import java.util.Scanner;

public class X_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
//        int n = sc.nextInt();
        int n=5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        String str = "geeksforgeeks";
        int ne = str.length();
        for (int i = 0; i < ne; i++) {
//            int l = ne - 1 - i;
            for (int j = 0; j < ne; j++) {
                if (i == j || j == ne - 1 - i) {
                    System.out.print(str.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}