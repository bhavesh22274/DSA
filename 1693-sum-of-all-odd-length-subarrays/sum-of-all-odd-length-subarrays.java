class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total=0;
        for(int len=1;len<=arr.length;len=len+2){
            for(int i=0;i+len<=arr.length;i++){
                int sum=0;
                for(int j=i;j<i+len;j++){
                    sum=sum+arr[j];
                }
                total=total+sum;
            }
        }
        return total;
    }
}