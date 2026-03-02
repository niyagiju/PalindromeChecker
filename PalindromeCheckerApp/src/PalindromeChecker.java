import java.util.Scanner;
public class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        if (input == null)
            return false;
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        char[] chars = normalized.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end])
                return false;

            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("UC11: Object-Oriented Palindrome Service");
        System.out.print("Input: ");
        String input = sc.nextLine();
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);
        if (result)
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is NOT a Palindrome.");

        sc.close();
    }
}
