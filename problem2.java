// Time Complexity : O(n)
// Space Complexity : O(1)  (fixed size arrays of 256)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No, only had to make sure mapping works both ways.


// Your code here along with comments explaining your approach in three sentences only
// We keep a mapping from characters in s to characters in t and also from t to s.
// While scanning, if an existing mapping does not match the current characters, return false.
// If we finish without conflicts, then both strings are isomorphic.


class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (map1[c1] == 0 && map2[c2] == 0) {
                map1[c1] = c2;
                map2[c2] = c1;
            } else {
                if (map1[c1] != c2 || map2[c2] != c1) return false;
            }
        }

        return true;
    }
}
