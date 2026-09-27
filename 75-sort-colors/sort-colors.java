class Solution {
    public void sortColors(int[] nums) {
        // int i=0;
        // int j=nums.length-1;
        // while(i<j){
        //     if(nums[i]!=0&&nums[j]!=2){
        //         int temp=nums[i];
        //         nums[i]=nums[j];
        //         nums[j]=temp;
        //         i++;
        //         j--;
        //     }else if(nums[i]==0){
        //         i++;
        //     }else if(nums[j]==2){
        //         j--;
        //     }
        // }
        //dutch national flag
        int i=0;//fixed
        int j=0;//move accornding to condition
        int k=nums.length-1;//fixed
        while(j<=k){//at j==k you need to process the last elemnt at j==k!!
            if(nums[j]==0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }else if(nums[j]==1){
                j++;
            }else if(nums[j]==2){//swapped hoke jo value aya hai j pe that can be any?therefore no movemnt in j!!
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
                k--;
            }
        }
    }
}