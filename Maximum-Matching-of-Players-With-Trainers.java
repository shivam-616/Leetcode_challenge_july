class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        // sorting both the array
        // then compare
        
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0 , count = 0, k =0;
        for(int j = 0;j<trainers.length;j++){

            if(i>=players.length || j>=trainers.length){
                System.out.println(i + "  "+j);
                 break;
            }

            if(players[i]<=trainers[j]){
                count+=1;
                System.out.println(i + "   "+j);
                i++;
            }
                System.out.println(k++);
        }
        return count;
    }
   
}