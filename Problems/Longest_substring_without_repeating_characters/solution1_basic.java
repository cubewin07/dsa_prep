package Problems.Longest_substring_without_repeating_characters;

import java.util.HashSet;

public class solution1_basic {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int length = 0;
 
        for(int i = 0; i< s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            length = Math.max(set.size(), length);
        }

        return length;
    }
}
