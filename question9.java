public class question9 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 21;

        System.out.println("Numbers between 20 to 25 :");

        do {
            sum += number;
            number ++;
        } while (number <25);

        System.out.println("\nSum of numbers between 20 to 25 is: " + sum);
    }
}
