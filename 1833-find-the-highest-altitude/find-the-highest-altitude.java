class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix=new int[gain.length+1];
        prefix[0]=0;
        for(int i=0;i<gain.length;i++){
            prefix[i+1]=prefix[i]+gain[i];
        }
        int max=prefix[0];
        for(int i=1;i<prefix.length;i++){
            if(max<prefix[i]){
                max=prefix[i];
            }
        }
        return max;
    }
}