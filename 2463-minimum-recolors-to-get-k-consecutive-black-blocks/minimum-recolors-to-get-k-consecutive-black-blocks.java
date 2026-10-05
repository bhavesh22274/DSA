class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left=0;
        int countw=0;
        int min=Integer.MAX_VALUE;
        for(int right=0;right<blocks.length();right++){
            if(blocks.charAt(right)=='W'){
                countw++;
            }
            if(right-left+1==k){
                min=Math.min(min,countw);
                if(blocks.charAt(left)=='W'){
                    countw--;
                }
                left++;
            }
        }
        return min;
    }
}