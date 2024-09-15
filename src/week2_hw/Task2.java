package week2_hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of numbers: ");
        String inputNumber = scanner.nextLine();
        scanner.close();
        get(inputNumber);
    }

    private static void get(String N) {
        char max_digit = '0';

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) > max_digit) {
                max_digit = N.charAt(i);
            }
        }

        System.out.println("The largest digit is: " + max_digit);
    }
}

class Task2WithReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of numbers: ");
        String inputNumber = scanner.nextLine();
        scanner.close();
        get(inputNumber, inputNumber.length() - 1, '0');
    }

    private static void get(String N, int n, char max_digit) {
        if (N.length() > 1000) {
            return;
        }
        if (n <= 0) {
            System.out.println("The largest digit is: " + max_digit);
            return;
        }
        if (N.charAt(n) > max_digit) {
            max_digit = N.charAt(n);
        }
        get(N, n - 1, max_digit);
    }
}
