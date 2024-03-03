package Pointer;

public class Solution1 {

    public static boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        String cleanedString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Check if the cleaned string is a palindrome
        int left = 0;
        int right = cleanedString.length() - 1;

        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage
        String input = "A man, a plan, a canal, Panama!";
        boolean result = isPalindrome(input);

        System.out.println("Is \"" + input + "\" a palindrome? " + result);
    }
}
