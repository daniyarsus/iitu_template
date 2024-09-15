package week1;

import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String result = "";
        for (
                int i = original.length() - 1;
                i >= 0;
                i--
        ) {
            result += original.charAt(i);
        }

        if (original.equals(result)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
