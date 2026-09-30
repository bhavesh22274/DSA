class Solution {
    public int pivotInteger(int n) {
        int total=0;
        for(int i=1;i<=n;i++){
            total=total+i;
        }
        int left=0;
        for(int i=1;i<=n;i++){
            int right=total-left-i;
            if(left==right){
                return i;
            }
            left=left+i;
        }
        return -1;
    }
}