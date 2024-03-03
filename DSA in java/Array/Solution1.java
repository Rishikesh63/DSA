package Array;

import java.util.*;

// class Solution1 {
//     public static int[] sortedSquares(int[] nums) {

//       for(int i=0;i<nums.length;i++){
//           nums[i]=nums[i]*nums[i];
        
//       } 
//       return nums; 
//     }
//     public static void printnums(int[] nums){
//         for(int i=0;i<nums.length;i++){
//             System.out.print(nums[i]);
//         }
//     }
//     public static void main(String args[]){

//        int[] nums={1,2,3,5} ;
//        sortedSquares(nums);
//        printnums(nums);   
//     }
// }

class Solution1 {
  public static String reverseWords(String s) {
      String newStr = "" ,word="";
      List<String>l=new ArrayList<>();
      s.trim();
      
       for(int i=0;i<s.length();i++){

          if(s.substring(i,i+1)!=""){
            char c = s.charAt(i);
            newStr = c+newStr;
          }
          else{
            l.add(newStr);
          }
        System.out.println(l);
          
       
       }
       return newStr;
  } 



    public static void main(String args[]){
    
      String str = "   my name is rishi";
     String result= reverseWords(str);
     System.out.println(result);

    }
}