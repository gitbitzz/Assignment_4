import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Enter integers ");
         System.out.println("PRESS 0 to stop:");

        do {
            System.out.print("Enter a number: ");
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Sum of your numbers are: " + sum);
    }
}
