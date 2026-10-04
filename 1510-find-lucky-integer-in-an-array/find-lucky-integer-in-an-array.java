class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int key=-1;
        for(int value:map.keySet()){
            if(map.get(value)==value){
                key=Math.max(key,value);
            }
        }
        return key;
    }
}