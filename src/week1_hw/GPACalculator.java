package week1_hw;

import java.util.Arrays;
import java.util.Scanner;

public class GPACalculator {
    public static void main(String[] args) {
        calculate();
    }
    private static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a count of subjects: ");

        int countOfSubjects = scanner.nextInt();

        int[] subjectsList = new int[countOfSubjects];

        for (int i = 0; i < countOfSubjects; i++) {
            subjectsList[i] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(subjectsList));

        int k = 0;
        for (int i = 0; i < countOfSubjects; i++) {
            k+=subjectsList[i];
        }
        System.out.println(k / countOfSubjects);
    }
}
