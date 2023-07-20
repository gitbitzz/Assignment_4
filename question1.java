import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the student's full name
        System.out.print("Enter student's full name: ");
        String studentName = scanner.nextLine();

        // Variables to store subject names and marks
        String subjectName;
        int marks;

        // Calculate grades for each subject and display the result
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Subject\t\tMarks\t\tGrade");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter subject " + i + " name: ");
            subjectName = scanner.nextLine();

            System.out.print("Enter marks " + subjectName + ": ");
            marks = scanner.nextInt();
            scanner.nextLine(); 

            String grade = calculateGrade(marks);
            System.out.println(subjectName + "\t\t" + marks + "\t\t" + grade);
        }
    }

    // Method to calculate the grade
    public static String calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return "A+";
        } else if (marks >= 80 && marks < 90) {
            return "A";
        } else if (marks >= 70 && marks < 80) {
            return "B";
        } else if (marks >= 60 && marks < 70) {
            return "C";
        } else if (marks >= 50 && marks < 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
