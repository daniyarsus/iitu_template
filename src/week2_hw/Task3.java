package week2_hw;

import java.util.Scanner;
import java.lang.Character;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        count(inputString);
    }

    private static void count(String text) {
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

class Task3WithReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        count(inputString, 0, 0);
    }

    private static void count(
            String text,
            int n,
            int counter
    ) {
        if (n >= text.length()) {
            System.out.println(counter);
            return;
        }
        if (Character.isDigit(text.charAt(n))) {
            counter++;
        }
        count(text, n + 1, counter);
    }
}
