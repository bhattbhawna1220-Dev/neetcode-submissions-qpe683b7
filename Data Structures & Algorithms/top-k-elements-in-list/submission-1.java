class Solution {
    
        
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int[] unique = new int[len];
        int[] freq = new int[len];
        int uniqcount =0;

        int count =1 ;
        for (int i=1;i<=len;i++){
            if(i<len && nums[i]==nums[i-1]){
                count++;
            }else{
                unique[uniqcount] = nums[i-1];
                freq[uniqcount] = count;
                uniqcount++;
                count =1;
            }
        }
        System.out.println(Arrays.toString(freq));
        System.out.println(Arrays.toString(unique));
        System.out.println(uniqcount);


        for(int i =0; i< uniqcount-1;i++){
            for(int j=0;j<uniqcount-i-1;j++){
                if(freq[j]<freq[j+1]){
                    int tempf = freq[j];
                    freq[j]=freq[j+1];
                    freq[j+1]=tempf;

                    int tempuniq = unique[j];
                    unique[j]= unique[j+1];
                    unique[j+1]=tempuniq;
                }

            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = unique[i];
        }

        return result;
    }
}


 