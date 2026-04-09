class Solution {
    public int maxArea(int[] heights) {
        //Below mentioned solution has time complexity O(n^2)
        // int maxWater =0; 
        // int n = heights.length;

        // for(int i =0;i<n ;i++){
        //     for(int j=i+1;j<n;j++){
        //         int width = j-i;
        //         int currWater = Math.min(heights[i],heights[j])*width; 
        //         if(currWater > maxWater)
        //             maxWater = currWater; 
        //     }
        //     }
        //     return maxWater;
        // }

        if(heights.length ==0) return 0;
        int maxWater = 0; 
        int left = 0;
        int right = heights.length-1; 

        while (left <right ){
            int width = right - left; 
            int currArea = width * Math.min(heights[left],heights[right]);

            maxWater = Math.max(maxWater, currArea);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxWater;

    }
}

