package Problems.Remove_duplicates_from_sorted_array;
import java.util.HashSet;
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int left=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i]))
                continue;
            set.add(nums[i]);
            nums[left] = nums[i];
            left++;
        }

        return set.size();
    }
}