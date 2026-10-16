class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;

        long[]square = new long [n];
        long ans = 0;

        for(int i = 0; i < n ; i++){
        square[i] = (long)nums[i] * nums[i];     
        }
         Arrays.sort(square);

       int mid = n/2;

       for(int i = 0; i < mid; i++){
        ans = ans - square[i];
       }

       for(int i = mid; i < n; i++){
        ans = ans + square[i];
       }

       return ans;

    }

}
