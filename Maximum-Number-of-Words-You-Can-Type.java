class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String [] str = text.split(" ");
        // char [] ch  = brokenLetters.toCharArray();
        boolean flag = true;
        int count = 0;
        for(String s : str){
            flag= true;
            for(char c : s.toCharArray()){
                if(brokenLetters.indexOf(c) != -1){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}