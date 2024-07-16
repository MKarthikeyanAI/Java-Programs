import java.util.Scanner;

public class market {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBill = 0.0;
        int choice;

        do {
            System.out.println("Market Bill Generator");
            System.out.println("1. CONE - ₹40");
            System.out.println("2. MILK - ₹42");
            System.out.println("3. BADAM - ₹15");
            System.out.println("4. Calculate Total Bill");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    totalBill += 10.99;
                    System.out.println("Item 1 added to the bill.");
                    break;
                case 2:
                    totalBill += 5.99;
                    System.out.println("Item 2 added to the bill.");
                    break;
                case 3:
                    totalBill += 3.49;
                    System.out.println("Item 3 added to the bill.");
                    break;
                case 4:
                    System.out.println("Total Bill: ₹" + totalBill);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        } while (choice != 5);

        scanner.close();
    }
}
