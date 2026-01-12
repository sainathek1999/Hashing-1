// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just needed to ensure one-to-one mapping (bijection).


// Your code here along with comments explaining your approach in three sentences only
// We split the string into words and check if number of words matches pattern length.
// Then we map each pattern character to one word and also map each word back to one character.
// If at any point mapping conflicts, return false, otherwise return true.

import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String w = words[i];

            if (!map1.containsKey(ch) && !map2.containsKey(w)) {
                map1.put(ch, w);
                map2.put(w, ch);
            } else {
                if (!map1.containsKey(ch) || !map2.containsKey(w)) return false;
                if (!map1.get(ch).equals(w) || map2.get(w) != ch) return false;
            }
        }

        return true;
    }
}
