class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int[] cum_sum=new int[nums.length];
        cum_sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            cum_sum[i]=cum_sum[i-1]+nums[i];
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
            int value=cum_sum[i]-k;
            if(map.containsKey(value)){
                int add=map.get(value);
                result=result+add;
            }
            map.put(cum_sum[i],map.getOrDefault(cum_sum[i],0)+1);
        }
        return result;
    }
}