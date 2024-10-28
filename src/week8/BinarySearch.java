package week8;

public class BinarySearch {
    int left = 0;
    int right = 0;
    int mid = 0;

    public int binarySearch(int[] array, int target) {
        right = array.length - 1;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int[] numbers = new int[1_000_000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int target = 5888457;

        long start = System.nanoTime();

        int result = binarySearch.binarySearch(numbers, target);

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
