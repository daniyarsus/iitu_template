package week2_hw;

import java.util.Scanner;

public class Task1 {
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

class Task1WithReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        count(number, 1, false);
    }

    private static void count(
            int number,
            int n,
            boolean canObtain
    ) {
        if (n <= 0) {
            System.out.println(canObtain);
            return;
        }
        count(number, n += 3, canObtain);
    }
}