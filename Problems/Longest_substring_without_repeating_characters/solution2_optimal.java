package Problems.Longest_substring_without_repeating_characters;

import java.util.HashMap;

public class solution2_optimal {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> indexStore = new HashMap<>();
        int left = 0;
        int length = 0;
    
        Character currentChar;
 
        for(int i = 0; i< s.length(); i++){
            currentChar = s.charAt(i);
            if(indexStore.containsKey(currentChar)){
                left = Math.max(left, indexStore.get(currentChar) + 1);
            }
            indexStore.put(currentChar, i);
            length = Math.max(length, i - left + 1);
        }

        return length;
    }
}
