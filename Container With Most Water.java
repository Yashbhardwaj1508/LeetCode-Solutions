class Solution {
    public int maxArea(int[] height) {

        int n = height.length;
        int i = 0;
        int j = n-1;
        int maxArea = 0;
     

        while(i < j){
            int distance = j - i;
            int minHeight = Math.min(height[i] , height[j]);
            int Area = distance * minHeight;
            maxArea = Math.max(maxArea , Area);
           
           if(height[i] < height[j]){
            i++;
           }

           else{
            j--;
           }

        }
        return maxArea;
    }
}
