package week1;

import java.util.Scanner;

public class GPACalculatorProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Числа: ");
        int lessonsCount = scanner.nextInt();

        double pointsCount = 0;
        int creditsCount = 0;

        for (
                int i = 1;
                i <= lessonsCount;
                i++
        ) {
            System.out.print("Enter grade points for subject " + i + " (max 4): ");
            double gradePoints = scanner.nextDouble();

            System.out.print("Enter credit hours for subject " + i + ": ");
            int credits = scanner.nextInt();

            pointsCount += gradePoints * credits;
            creditsCount += credits;
        }

        double result = pointsCount / creditsCount;
        System.out.printf("GPA равен: %.2f", result);
    }
}
