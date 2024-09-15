package week2_hw;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an string: ");

        String inputString = scanner.nextLine();
        scanner.close();
        form(inputString);
    }

    private static void form(String text) {
        String reversedText = "";

        for (
                int i = text.length() - 1;
                i >= 0;
                i--
        ) {
            reversedText += text.charAt(i);
        }

        System.out.println(text + reversedText);
    }
}

class Task6WithReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        String reversedString = form(inputString, inputString.length() - 1, "");
        System.out.println("Reversed string: " + reversedString);
    }

    private static String form(String text, int n, String reversedText) {
        if (n < 0) {
            return reversedText;
        }
        reversedText += text.charAt(n);
        return form(text, n - 1, reversedText);
    }
}