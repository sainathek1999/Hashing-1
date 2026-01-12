// Time Complexity : O(n * k log k)  (n = number of words, k = avg length of word)
// Space Complexity : O(n * k)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, just needed a common key to group same anagrams.


// Your code here along with comments explaining your approach in three sentences only
// For every word, we sort its characters and use that sorted string as a key.
// All words having same sorted key are anagrams, so we store them together in a map.
// Finally, we return all grouped lists from the map.

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
