public class possibleStringCount {
    public static void main(String[] args) {
        possibleStringCount obj = new possibleStringCount();
        String word = "aaabbbcc";
        int result = obj.possibleStringCount(word);
        System.out.println("The number of possible strings is: " + result);
    }
    public int possibleStringCount(String word) {
        int sum = 0 ;
        for(int i = 1 ;i<word.length() ;i++){
            if(word.charAt(i) == word.charAt(i-1)) sum+=1;
        }
        return sum+1;
    }
}
