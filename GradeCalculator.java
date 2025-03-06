import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        // Get the student score
        int score = getStudentScore();
        
        // Calculate the grade based on the score
        String grade = calculateGrade(score);
        
        // Display the result
        System.out.println("Your Grade is: " + grade);
    }

    // Method to get the student's score from the user
    public static int getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        int score = -1;

        // Loop to ensure valid input
        while (score < 0 || score > 100) {
            System.out.print("Enter your score (0-100): ");
            
            if (scanner.hasNextInt()) {
                score = scanner.nextInt();
                
                if (score < 0 || score > 100) {
                    System.out.println("Invalid score. Please enter a value between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numerical score.");
                scanner.next(); // Clear invalid input
            }
        }

        return score;
    }

    // Method to calculate the grade based on score
    public static String calculateGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}


