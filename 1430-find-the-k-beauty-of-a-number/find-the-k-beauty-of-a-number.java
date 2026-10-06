class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=String.valueOf(num);//240-->"240".
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            if(right-left+1==k){
                int value=Integer.parseInt(s.substring(left,right+1));//+1 is exclusive
                if(value!=0&&num%value==0){
                    count++;
                }
                left++;
            }
        }
        return count;
    }
}