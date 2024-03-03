package HashSet;

// Insert =Search/Contain=Delete/Remove=O(1) -> HashSet
//I-O(1),S-O(n),D-O(1) ->Array
//Binary ST--O(h) all,worst case O(n) all
// import java.util.HashSet;
// import java.util.Iterator;
// public class Solution {
    
//     public static void main(String[] args) {
//         //creating
//         HashSet<Integer>set=new HashSet<>();
//         //insert
//         set.add(1);
//         set.add(2);
//         set.add(1);
//         set.add(3);
//         //Search-Contains
//         if(set.contains(1)){
//             System.out.println("set contains 1");
//         }
//         if(!set.contains(5)){
//             System.out.println("set does not contain 6");
//         }
//         System.out.println(set);
//         System.out.println("size of set:" +set.size());
//         // delete
//         set.remove(1);
//         if(!set.contains(1)){
//             System.out.println(set);
//             System.out.println("1 is deleted from set ");
//         }
//         //Iterator
//        Iterator it =set.iterator();
//        // iterator has two function -hashnext,next
//        while (it.hasNext()) {
//         System.out.println(it.next());
//        }
//     //    it.next();
//     //    System.out.println(it.next());
    
//     }
// }


import java.util.*;

class Solution {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");  // Use " " to split into words

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> patternToWord = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String currWord = words[i];
            char currCharacter = pattern.charAt(i);

            if (patternToWord.containsKey(currCharacter)) {
                if (!patternToWord.get(currCharacter).equals(currWord)) {
                    return false;
                }
            } else {
                patternToWord.put(currCharacter, currWord);
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));  // Output: true
    }
}
