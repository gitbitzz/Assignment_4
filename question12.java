public class question12 {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;

        while (number <= 50) {
            if (number % 2 != 0) {
                sum += number;
            }
            number++;
        }

        System.out.println("Sum of odd numbers from 1 to 50 is: " + sum);
    }
}
