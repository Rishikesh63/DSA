package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

    public static boolean isHappy(int n) {
        Set<Integer> seenNumbers = new HashSet<>();

        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getNextHappyNumber(n);
        }

        return n == 1;
    }

    private static int getNextHappyNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage:
        int number = 19;
        boolean result = isHappy(number);
        System.out.println("Is " + number + " a happy number? " + result);
    }
}
