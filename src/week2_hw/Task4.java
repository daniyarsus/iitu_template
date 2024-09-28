package week2_hw;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inputString = scanner.nextLine();
        scanner.close();
        take(inputString);
    }

    private static void take(String text) {
        String newString = "";
        for (int i = 0; i < text.length(); i++) {
            newString += text.charAt(i);
            if (i != text.length() - 1) {
                newString += "*";
            }
        }
        System.out.println(newString);
    }
}

class Task4WithReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String inputString = scanner.nextLine();
        scanner.close();
        take(inputString, 0, "");
    }

    private static void take(
            String text,
            int n,
            String newString
    ) {
        if (n >= text.length()) {
            System.out.println(newString);
            return;
        }
        newString += text.charAt(n);
        if (n != text.length() - 1) {
            newString += "*";
        }
        take(text, n + 1, newString);
    }
}
