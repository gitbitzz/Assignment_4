public class question11 {
    public static void main(String[] args) {
        int number = 2; // Start checking from 2 as 0 and 1 are not prime numbers

        System.out.println("Prime numbers from 0 to 100:");

        while (number <= 100) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
            number++;
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        // Loop to check divisibility of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
