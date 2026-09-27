class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Approach-1
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         int value=nums[i]+nums[j];
        //         if(value==target){
        //             return new int[]{i,j};
        //         }
        //     }
        // }
        // return new int[]{-1,-1};
        //Approach-2
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req_number=target-nums[i];
            if(map.containsKey(req_number)){
                return new int[]{map.get(req_number),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}