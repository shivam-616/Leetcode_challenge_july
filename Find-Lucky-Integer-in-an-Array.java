class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i : arr){
                map.put(i , map.getOrDefault(i , 0) + 1 );
        }
        int max = -1;
       
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
               if(entry.getKey() == entry.getValue() && max<entry.getKey()) max = entry.getKey();
            }
        return max;
    }
}