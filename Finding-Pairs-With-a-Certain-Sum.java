class FindSumPairs {
    HashMap<Integer , Integer> map = new HashMap<>();
    private int[] nums1;
    private int[] nums2;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;

        for(int i : nums2){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }
    }
    
    public void add(int index, int val) {
     int old_value = nums2[index];
     nums2[index]+=val;
     int new_Value = nums2[index];

    if(map.get(old_value) <= 1){
        map.remove(old_value);
    }else{
         map.put(old_value  , map.get(old_value)-1);
    }
    map.put(new_Value , map.getOrDefault(new_Value , 0)+1 );
    }
    public int count(int tot) {
        int count = 0;

        for(int i : nums1){
            int element = tot - i ;
             count+=map.getOrDefault(element , 0 );
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */