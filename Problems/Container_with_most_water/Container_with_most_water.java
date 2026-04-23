package Problems.Container_with_most_water;

public class Container_with_most_water {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ba = -1;
        while(l < r){
            int lh = height[l];
            int lr = height[r];
            int limit = Math.min(lh, lr);
            int length = r - l;
            int area = limit * length;
            ba = Math.max(ba, area);


            if(lh < lr){
                l++;
                continue;
            }

            r--;
            
        }

        return ba;
    }
}
