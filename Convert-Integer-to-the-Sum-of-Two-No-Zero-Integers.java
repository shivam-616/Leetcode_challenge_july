class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[] = new int[2];
        int i;
        for( i = 1 ; i<=n-1;i++){
            if(!(iscontainsZero(i) || iscontainsZero(n-i))){
                break;
            }
            System.out.print(i + " " + (n-i));
        }
        arr[0] = i;
        arr[1] = n-i;
        return arr;
    }
     public boolean iscontainsZero(int n){
        while(n > 0){
            int digits = n % 10;
            if(digits == 0) return true;
            n /= 10;
        }
        return false;
    }
}