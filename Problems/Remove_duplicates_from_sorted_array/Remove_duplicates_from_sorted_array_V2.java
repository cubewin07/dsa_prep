package Problems.Remove_duplicates_from_sorted_array;

import java.util.HashMap;

public class Remove_duplicates_from_sorted_array_V2 {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int val;
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != null){
                if(map.get(nums[i]) >=2 ){
                    continue;
                }
            }

            val = map.get(nums[i]) == null ? 0 : map.get(nums[i]);
            map.put(nums[i], val + 1);
            nums[left++] = nums[i];

        }
        return left;
    }
}
