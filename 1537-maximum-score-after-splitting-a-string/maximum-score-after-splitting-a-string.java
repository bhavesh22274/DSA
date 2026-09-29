class Solution {
    public int maxScore(String s) {
        char[] temp=s.toCharArray();
        int n=s.length()-1;
        //int total=0;
        int max=0;//max as you are checking multiple options!!
        for(int i=1;i<s.length();i++){
            int left=count_zeros(temp,0,i-1);
            int right=count_ones(temp,i,n);
            int total=left+right;
            max=Math.max(total,max);
        }
        return max;
    }
    public int count_zeros(char[] temp,int i,int j){
        int count=0;
        for(int k=i;k<=j;k++){
            if(temp[k]=='0'){
                count++;
            }
        }
        return count;
    }
    public int count_ones(char[] temp,int i, int j){
        int count=0;
        for(int k=i;k<=j;k++){
            if(temp[k]=='1'){
                count++;
            }
        }
        return count;
    }
}