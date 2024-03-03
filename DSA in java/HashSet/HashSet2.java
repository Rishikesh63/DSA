
package HashSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSet2 {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        Set<Integer> numbers = new HashSet<>();
        
        System.out.println("Enter " + (n - 1) + " integers:");
        for (int i = 0; i < n - 1; i++) {
            int num = sc.nextInt();
            numbers.add(num);
        }
        
        sc.close();
        
        int missingNumber = findMissingNumber(n, numbers);
        System.out.println("The missing number is: " + missingNumber);
    }
    
    private static int findMissingNumber(int n, Set<Integer> numbers) {
        int totalSum = (n * (n + 1)) / 2; // Sum of numbers from 1 to n
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        return totalSum - sum;
    }
}
