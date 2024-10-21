package week8;

public class LinearSearch {
    public static void main(String[] args) {
        int target = 3;
        int[] numbers = {1, 2, 3, 4};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println(i);
            }
        }
    }
}
