class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        HashMap<Character , Integer> vowel_map = new HashMap<>();
        String str = "aeiou";
        for(char ch : s.toCharArray()){
            if(str.indexOf(ch) != -1) {
              vowel_map.put(ch , vowel_map.getOrDefault(ch , 0)+1);  
            }else{
              map.put(ch , map.getOrDefault(ch , 0) +1);  
            }
         }
        int max1 = 0 , max = 0;
        for(Map.Entry<Character , Integer> entry : map.entrySet()){
            max = Math.max(max , entry.getValue());
        }
        for(Map.Entry<Character , Integer> entry : vowel_map.entrySet()){
            max1 = Math.max(max1 , entry.getValue());
        }
        return max + max1;
    }
}