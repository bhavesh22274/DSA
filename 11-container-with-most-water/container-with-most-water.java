class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int current_area=Math.min(height[i],height[j])*(j-i);
            max=Math.max(current_area,max);
            if(height[i]>height[j]){//jo height choti hai..thats limiting height..try to avoid it!
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}