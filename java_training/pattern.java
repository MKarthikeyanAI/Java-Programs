package java_training;

import java.util.Scanner;

class pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}