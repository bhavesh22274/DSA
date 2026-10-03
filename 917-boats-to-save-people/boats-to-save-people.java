class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        // int i=0;
        // int j=people.length-1;
        // int boat=0;
        // while(i<j){
        //     if(people[i]==limit){
        //         boat=boat+1;
        //         i++;
        //     }
        //     if(people[j]==limit){
        //         boat++;
        //         j--;
        //     }
        //     if(people[i]+people[j]<=limit){
        //         boat++;
        //         i++;
        //         j--;
        //     }
        // }
        // return boat;
        int i=0;
        int j=people.length-1;
        int boat=0;
        while(i<=j){
            int sum=people[i]+people[j];
            if(sum<=limit){
                boat++;
                i++;
                j--;
            }else{//no possability that ki heaviest person heavier than limit aee!!
                boat++;
                j--;
            }
        }
        return boat;
    }
}