class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] answer=new int[queries.length];
        int[] prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        //prefix[]  queries[]
        for(int i=0;i<queries.length;i++){
            int count=0;
            for(int j=0;j<prefix.length;j++){
                if(prefix[j]<=queries[i]){
                    count++;
                }
            }
            answer[i]=count;
        }
        return answer;
    }
}