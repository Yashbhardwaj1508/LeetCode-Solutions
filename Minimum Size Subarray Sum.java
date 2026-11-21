class Solution {
    public int minSubArrayLen(int target, int[] nums) {

      int n = nums.length;
      int sum = 0;
      int minLength = Integer.MAX_VALUE;
      int i = 0;

      for(int j = 0; j < n; j++){
        sum = sum + nums[j];

        while(sum >= target){
            int len = j - i + 1;
           minLength = Math.min(minLength , len);

            sum = sum - nums[i];
            i++;

        }
      }
      return minLength == Integer.MAX_VALUE ? 0:minLength;

    }
}
