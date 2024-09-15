package week1_hw;

import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxAndMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] intArray = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println(findMaxAndMinInArray(intArray));
    }

    private static ArrayList<Integer> findMaxAndMinInArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i+1]) {
                arr[i] = arr[i+1];
                arr[i+1] = arr[i];
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        result.add(arr[arr.length - 1]);

        return result;
    }
}
