package week2_hw;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an string: ");

        String inputString = scanner.nextLine();
        scanner.close();
        reduce(inputString);
    }

    private static void reduce(String text) {
        String reducedString = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - i - 1)) {
                reducedString += text.charAt(i);
            }
        }

        System.out.println(reducedString);
    }
}

class Task7WithReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        reverse(inputString, 0, "");
    }

    private static void reverse(
            String text,
            int n,
            String reducedString
    ) {
        if (n >= text.length()) {
            System.out.println(reducedString);
            return;
        }
        if (text.charAt(n) != text.charAt(text.length() - n - 1)) {
            reducedString += text.charAt(n);
        }
        reverse(text, n + 1, reducedString);
    }
}
