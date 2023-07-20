import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the student's full name
        System.out.print("Enter student's full name: ");
        String studentName = scanner.nextLine();

        // Get the score from the user
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();

        // Calculate the grade based on the score
        String grade;
        if (score >= 70 && score<=100) {
            grade = "A";
        } else if (score >= 60 && score<=69) {
            grade = "B";
        } else if (score >= 50 && score<=59) {
            grade = "C";
        } else if (score >= 40 && score<=49) {
            grade = "D";
        } else if (score >= 0 && score<=39) {
            grade = "E";
        } else {
            grade = "Invalid";
        }

        // Output the student's full name and grade
        System.out.println("Student Name: " + studentName);
        System.out.println("Grade: " + grade);
    }
}
