package week1_hw;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();

        System.out.println(factorial(inputNumber));
    }

    private static Integer factorial(int inputNumber) {
        return inputNumber == 1 ? 1 : inputNumber * factorial(inputNumber - 1);
    }
}
