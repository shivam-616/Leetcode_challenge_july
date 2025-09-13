class Solution {
    public boolean doesAliceWin(String s) {
        String str ="aeiou";
        int count = 0;
        boolean flag = true;
        for(char ch : s.toCharArray()){
           if(str.indexOf(ch) != -1){
            count++;
           }
        } 
        if(count == 0) return false;
         return true;


    }
}