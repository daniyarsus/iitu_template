package week1_hw;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int inputNumber = scanner.nextInt();
        fibonacci(inputNumber);
    }

    private static void fibonacci(int size) {
        int a = 0;
        System.out.println(a);

        int b = 1;
        System.out.println(b);

        int next;
        for (int i = 2; i < size; i++) {
            next = a + b;
            System.out.println(next);
            a = b;
            b = next;
        }
    }
}
