package LogicBuildingWipro;



public class SumofdigitsofallN {

    public static void main(String[] args) {
        System.out.println(digitSum(976592));   // Output: 2
        System.out.println(digitSum(123456));   // Output: 3
        System.out.println(digitSum(-123456));  // Output: -3
    }

    public static int digitSum(int number) {
        // Check if the number is negative
        boolean isNegative = number < 0;

        // Convert the number to a positive value if it is negative
        if (isNegative) {
            number = -number;
        }

        // Calculate the digit sum until the number is a single digit
        while (number >= 10) {
            number = sumOfDigits(number);
        }

        // If the original number was negative, make the result negative
        return isNegative ? -number : number;
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}


