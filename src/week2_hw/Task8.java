package week2_hw;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to remove: ");
        int element = scanner.nextInt();

        remove(n, arr, element);
    }

    private static void remove(int length, int[] arr, int element) {
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Element not found in the array.");
            return;
        }

        int[] newArr = new int[length - count];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] != element) {
                newArr[index++] = arr[i];
            }
        }

        System.out.println("Array after removal: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }
}
