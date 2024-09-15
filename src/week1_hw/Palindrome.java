package week1_hw;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        String resultString = "";
        for (
                int i = inputString.length() - 1;
                i >= 0;
                i--
        ) {
            resultString += inputString.charAt(i);
        }

        if (inputString.equals(resultString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
