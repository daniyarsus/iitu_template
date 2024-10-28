package week8;

public class LinearSearch {
    public static int linearSearch(int target, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                return numbers[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int target = 5888454;
        int[] numbers = new int[1_000_000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        long start = System.nanoTime();

        int result = linearSearch(target, numbers);

        long finish = System.nanoTime();

        double timeResult = (finish - start) / 1_000_000.0;

        if (result != -1) {
            System.out.println("Element index found on: " + result);
        } else {
            System.out.println("Element not found!");
        }

        System.out.printf("Time taken: %.6f milliseconds%n", timeResult);
    }
}
