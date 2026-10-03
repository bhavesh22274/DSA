class Solution {
    public int minStartValue(int[] nums) {
        //in prefix sum if you say maximum sum found than is the maximum sum can found and vice versa in case of negative value*
        int sum=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            min=Math.min(min,sum);
        }
        return 1-min;
    }
}