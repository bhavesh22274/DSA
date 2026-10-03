class Solution {
    public int findNumbers(int[] nums) {
        int m=0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int count=0;
            while (number > 0) {
                int digit = number % 10;
                count++;
                number = number / 10;
            }
            if(count%2==0){
                m++;
            }
        }
        return m;

    }
}