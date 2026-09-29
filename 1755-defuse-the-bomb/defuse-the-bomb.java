class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            if(k==0){
                return arr;
            }
            else if(k>0){
                for(int j=1;j<=k;j++){
                    sum=sum+code[(i+j)%n];
                }
            }else if(k<0){
                for(int j=1;j<=-k;j++){
                    sum=sum+code[(i-j+n)%n];
                }
            }
            arr[i]=sum;
        }
        return arr;








        // int[] result=new int[code.length];
        // int sum=0;
        // for(int i=0;i<code.length;i++){
        //     sum=sum+code[i];
        // }
        // for(int i=0;i<code.length;i++){
        //     if(k==0){
        //         code[i]=0;
        //     }
        //     else if(k>0){
        //         code[i]=sum-code[i];
        //     }else if(k<0){
        //         int[] arr=new int[code.length];
        //         for(int j=0;j<code.length;j++){
        //             if(j==0){
        //                 arr[j]=code[code.length-1]+code[code.length-2];
        //             }
        //             else if(j==1){
        //                 arr[j]=code[0]+code[code.length-1];
        //             }else if(j<1){
        //                 arr[j]=code[j-1]+code[j-2];
        //             }
                    
        //         }
        //         return arr;
        //     }
        // }
        // return code;
    }
}