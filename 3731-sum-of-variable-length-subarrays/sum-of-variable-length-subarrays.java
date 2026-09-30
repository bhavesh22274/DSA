class Solution {
    public int subarraySum(int[] nums) {
        int start=0;
        int[] sum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            start=Math.max(0,i-nums[i]);
            //sum=nums[start...i]
            sum[i]=sumfromarray(nums,start,i);
        }
        int finalsum=0;
        for(int i=0;i<sum.length;i++){
            finalsum=finalsum+sum[i];
        }
        return finalsum;
    }
    public int sumfromarray(int[] nums,int start,int i){
        int summ=0;
        for(int j=start;j<=i;j++){
            summ=summ+nums[j];
        }
        return summ;
    }
}