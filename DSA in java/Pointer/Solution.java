package Pointer;

// public class Solution {
//   public int removeDuplicate(int nums[]) {
//      int k=0;
//      for(int i=0;i<nums.length;i++){
//         for(int j=0;j<nums.length;j++){
//             if(nums[i]==nums[j]){
//                 k++;
//                 if(k>1){
//                 nums[j]=nums[j+1];
//                 }
//             }

//         }
//      }
//       return 1;
//   } 
//   public static void main(String[] args) {
//     int nums[]={0,1,1,2,3,3,4};
    
    
//   }
// }


// public class Solution {
//   public boolean isSubsequence(String s, String t) {
//       int sIndex = 0;
      
//       for (int i = 0; i < t.length() && sIndex < s.length(); i++) {
//           if (s.charAt(sIndex) == t.charAt(i)) {
//               sIndex++;
//           }
//       }
      
//       return sIndex == s.length();
//   }

//   public static void main(String[] args) {
//       Solution sol = new Solution();

//       // Example usage:
//       String s1 = "abc";
//       String t1 = "ahbgdc";
//       System.out.println(sol.isSubsequence(s1, t1));  // Output: true

//       String s2 = "aec";
//       String t2 = "abcde";
//       System.out.println(sol.isSubsequence(s2, t2));  // Output: false
//   }
// }


import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        
        int n = citations.length;
        
        for (int i = 0; i < n; i++) {
            int h = n - i;//
            
            if (citations[i] >= h) {
              System.out.println(i);
              System.out.println(citations[i]);
              System.out.println(h);
              System.out.println(citations[i]);
                return h;
            }
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example usage:
        int[] citations = {6, 0, 1,-1,5};
        System.out.println(citations[3]);
        System.out.println(sol.hIndex(citations));  // Output: 3
    }
}