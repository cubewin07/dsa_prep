package Problems.Container_with_most_water;

class Container_with_most_water {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ba = -1;
        while(l < r){
            int lh = height[l];
            int lr = height[r];
            int area = (r - l) * Math.min(lh, lr);
            ba = Math.max(ba, area);


            if(lh < lr){
                l++;
            } else {
                r--;
            }

            
        }

        return ba;
    }
}