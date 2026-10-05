class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int right=0;right<nums.length;right++){
            sum=sum+nums[right];
            if(right-left+1==k){
                max=Math.max(sum,max);
                sum=sum-nums[left];
                left++;
            }
        }
        return (double) max/k;
    }
}