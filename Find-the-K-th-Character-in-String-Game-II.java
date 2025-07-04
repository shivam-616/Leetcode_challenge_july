class Solution {
    public char kthCharacter(long k, int[] operations) {
               int count = 0;
               Long val = k;
               while(val>1){
                int jumps = (int) Math.ceil(Math.log(val) / Math.log(2));
                val-=(long) Math.pow(2 , jumps-1);
                count+=operations[jumps -1];
               }
               return (char) ('a' + (count % 26));

    }
    // public String solver(int []operations , String word ,int k){
    //     int size = operations.length;
    //     int i = 0;
    //     while(i<size && word.length() <= k){
    //         if(operations[i] == 1){
    //                String str = "";
    //             for(char ch : word.toCharArray()){
    //                 str+=(char)(ch + 1);
    //             }
    //             word+=str;
    //         }else{
    //             word = word + word;
    //         }
    //         i++;
    //     }
    //     return word;
    // }
}