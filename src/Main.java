public class Main {
    public static void main(String[] args) {
        String str = "radar";

        if (isPalindrome(str)) {
            System.out.println("Строка \"" + str + "\" является палиндромом.");
        } else {
            System.out.println("Строка \"" + str + "\" не является палиндромом.");
        }
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
