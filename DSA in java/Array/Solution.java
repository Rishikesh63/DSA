package Array;

// public class Solution {

//     static void rotateArray(int[] nums, int k) {
//       int n=nums.length;
//        k = k%n;
//        reverseArray(nums, 0, n-1);
//        reverseArray(nums, k, n-1);
//        reverseArray(nums, 0, k-1);
//     }

//     static void reverseArray(int[] nums, int start, int end) {
      
//         while (start<end) {
//             int temp=nums[start];
//             nums[start]=nums[end];
//             nums[end]=temp;
//             start++;
//             end--;
//         }
//     }
//     static void printnums(int[] nums){
//      for(int i=0;i<nums.length;i++){
//         System.out.print(nums[i]);
//      }
//     }
//     public static void main(String[] args) {
//        int[] nums={1,2,3,4};
//        int k =2;
//        rotateArray(nums, k);
//        printnums(nums);


//     }
// }
 
class Solution {
    public static String reverseVowels(String s) {
        int j=s.length();
        for(int i=0;i<s.length();i++){
          if(s.substring(i,i+1)=="a"|| s.substring(i,i+1)=="e" || s.substring(i,i+1)=="i" ||s.substring(i,i+1)=="o" ||s.substring(i,i+1)=="u"){
            if(s.substring(i,i+1)=="a"|| s.substring(i,i+1)=="e" || s.substring(i,i+1)=="i" ||s.substring(i,i+1)=="o" ||s.substring(i,i+1)=="u"){
            
           }
          }
        }
      return s;  
    }
    public static void main(String[] args) {
        String str ="hello";
        reverseVowels(str);
    }
}