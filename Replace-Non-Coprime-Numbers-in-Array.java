class Solution {
   public static List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i :nums){
            list.add(i);
        }
        return recur(list);
    }
    
    public static List<Integer> recur(List<Integer> nums){
       int i = 0;
        while (i < nums.size() - 1) {
            int current = nums.get(i);
            int next = nums.get(i + 1);

            // Check for a non-coprime pair
            if (gcd(current, next) > 1) {
                // Calculate the LCM of the pair
                int mergedNum = lcm(current, next);
                
                // Replace the two elements with their LCM
                nums.set(i, mergedNum);
                nums.remove(i + 1);

                // ✅ CORRECT LOGIC:
                // After merging, the new number at index 'i' might be non-coprime
                // with the *previous* element (at i-1). We must step back to re-check.
                if (i > 0) {
                    i--;
                }
            } else {
                // If they are coprime, just move to the next pair.
                i++;
            }
        }
        return nums;
    }

    /**
     * ✅ Efficient GCD using the Euclidean algorithm (modulo version).
     */
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /**
     * ✅ Overflow-safe LCM calculation.
     */
    public static int lcm(int a, int b) {
        // Using (long) prevents the multiplication from overflowing the int limit
        return (int) ((long) a * b / gcd(a, b));
    }
}