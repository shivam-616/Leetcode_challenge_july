class Solution {
    public char kthCharacter(int k) {
        if(k==1){
            return 'a';
        }

         return solver("ab" , k).charAt(k-1);
    }
    public String solver(String word ,int k){
        if(k <= word.length()){
            return word;
        }
        String s1 = "";
        for(char ch : word.toCharArray()){
            s1+=(char)(ch+1);
        }    
        System.out.println(word+s1);
        return solver(word+s1, k);
    }
}