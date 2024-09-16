package week1_hw;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        int number = scanner.nextInt();
        scanner.close();
        count(number);
    }

    private static void count(int number) {
        boolean canObtain = false;
        for (int i = 1; i <= number; i += 3) {  // Добавляем по 3 в цикле
            if ((number - i) % 5 == 0) {  // Если оставшееся число делится на 5, значит можно получить N
                canObtain = true;
                break;
            }
        }

        if (canObtain) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
