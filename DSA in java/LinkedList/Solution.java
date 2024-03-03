package LinkedList;

//  class Solution {
//     public static String longestPalindrome(String s) {
//         int j = s.length()-1;
//        for(int i=0;i<s.length();i++){
//          if(s.charAt(i)!=s.charAt(j)){
//            return "it is not";
//          }
//          j--;
//        }
//        return "it is";
//     } 

//     public static void main(String args[]){

//     System.out.println(longestPalindrome("1221"));
//     }
// }

// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter an integer: ");
//         int number = scanner.nextInt();

//         int numberOfSetBits = countSetBits(number);

//         System.out.println("Number of set bits in " + number + ": " + numberOfSetBits);

//         scanner.close();
//     }

//     // Function to count the number of set bits in an integer
//     static int countSetBits(int n) {
//         int count = 0;

//         // Loop through each bit
//         while (n > 0) {
//             // Increment count if the rightmost bit is set (1)
//             count += n & 1;

//             // Right shift the number to check the next bit
//             n = n >> 1;
//         }

//         return count;
//     }
// }


// import java.util.Scanner;
// public class Solution {
//     // you need to treat n as an unsigned value
//     public static int hammingWeight(int n,int count) {
//         while(n>0){
//             count+= n & 1;
//            n= n>>1;
//         }
//         return count;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int count =hammingWeight(n,0);
//         System.out.print(count); 
//     }
// }

// import java.util.Scanner;

// public class Solution {
//     // you need to treat n as an unsigned value
//     public int hammingWeight(int n) {
//         int count = 0;
//         while (n != 0) {
//             count += n & 1;
//             n = n >>> 1; // Use logical right shift to treat n as an unsigned value
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter no.");
//         int n = sc.nextInt();
//         int result = solution.hammingWeight(n);
//         System.out.println("Number of set bits in " +n+":" + result);
//         sc.close();
//     }
// }

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public class ListNode{
//         int val;
//         ListNode next;
//         ListNode(){}
//         ListNode(int val){
//             this.val = val;
//         }
//         ListNode(int val,ListNode next){
//             this.val = val;
//             this.next =  next;

//         }
//     }
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//          String str =l1.toString();
//          int nums = Integer.parseInt(str);
//         String str2= l2.toString();
//         int nums2= Integer.parseInt(str2);
//         int result = nums+nums2;
//         String resultStr = Integer.toString(result);
//     }
// }



