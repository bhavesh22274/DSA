class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int prev=sum-goal;
            if(map.containsKey(prev)){
                result=result+map.get(prev);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return result;
    }
}