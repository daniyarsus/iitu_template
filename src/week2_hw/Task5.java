package week2_hw;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an string: ");
        String inputString = scanner.nextLine();
        scanner.close();
        put(inputString);
    }

    private static void put(String text) {
        String resultString = "";
        resultString += "(";

        if (text.length() % 2 == 0) {
            int firstMiddlePlace = text.length() / 2 - 1;
            int secondMiddlePlace = text.length() / 2;

            for (int i = 0; i < text.length(); i++) {
                if (i == firstMiddlePlace) {
                    resultString += text.charAt(i);
                } else if (i == secondMiddlePlace) {
                    resultString += text.charAt(i);
                    resultString += ")";
                }

                if (i < firstMiddlePlace) {
                    resultString += text.charAt(i);
                    resultString += "(";
                } else if (i > secondMiddlePlace) {
                    resultString += text.charAt(i);
                    resultString += ")";
                }
            }
        } else {
            int middlePlace = text.length() / 2 + 1;
            for (int i = 0; i < text.length(); i++) {
                if (i == middlePlace) {
                    resultString += text.charAt(i);
                    resultString += ")";
                }

                if (i < middlePlace) {
                    resultString += text.charAt(i);
                    resultString += "(";
                } else if (i > middlePlace) {
                    resultString += text.charAt(i);
                    resultString += ")";
                }
            }
        }
        System.out.println(resultString);
    }
}
