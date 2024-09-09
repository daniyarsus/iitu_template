import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter grade points for subject " + i + " (max 4): ");
            double gradePoints = scanner.nextDouble();
            
            System.out.print("Enter credit hours for subject " + i + ": ");
            int credits = scanner.nextInt();

            totalPoints += gradePoints * credits;
            totalCredits += credits;
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("Your GPA is: %.2f", gpa);
    }
}
