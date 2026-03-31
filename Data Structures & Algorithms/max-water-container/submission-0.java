class Solution {
    public int maxArea(int[] heights) {
        int maxWater =0; 
        int n = heights.length;

        for(int i =0;i<n ;i++){
            for(int j=i+1;j<n;j++){
                int width = j-i;
                int currWater = Math.min(heights[i],heights[j])*width; 
                if(currWater > maxWater)
                    maxWater = currWater; 
            }
            }
            return maxWater;
        }

    }

