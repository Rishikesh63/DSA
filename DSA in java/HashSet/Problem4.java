package HashSet;

import java.util.HashMap;

class Problem4 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            System.out.println(charCountMap);
        }

        for (char c : t.toCharArray()) {
            if (!charCountMap.containsKey(c) || charCountMap.get(c) == 0) {
                return false;
            } else {
                charCountMap.put(c, charCountMap.get(c) - 1);
                System.out.println(charCountMap);
            }
        }

        return true;
    }

    public static void main(String args[]) {
        String s = "aaca";
        String t = "ccac";
        System.out.print(isAnagram(s, t));
    }
}
