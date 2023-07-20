public class question8 {
    public static void main(String[] args) {
        int number = 12;
        
        System.out.println("Even numbers from 12 to 50:");
        
        do {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
            number++;
        } while (number <= 50);
        
        System.out.println(); // Print a new line after the loop
    }
}
