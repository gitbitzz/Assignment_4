import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        String result;

        switch (compareNumbers(num1, num2)) {
            case 1:
                result = "num1 is bigger";
                break;
            case 2:
                result = "num2 is bigger";
                break;
            default:
                result = "Both numbers are equal";
                break;
        }

        System.out.println(result);
    }

    // Method to compare two numbers and return 1 if num1 is greater, 2 if num2 is greater, or 0 if both are equal
    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num2 > num1) {
            return 2;
        } else {
            return 0;
        }
    }
}
