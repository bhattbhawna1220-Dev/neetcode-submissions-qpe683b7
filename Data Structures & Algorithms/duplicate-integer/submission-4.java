class Solution {
    public boolean hasDuplicate(int[] nums) {
        /****************** Brute Force ***********
        iterate with every element of array and check the duplicacy 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

            if (nums[i]==nums[j]){
                return true;
            }}

        }

        return false;

        *******************************/

        // hashset db has no duplicate element 
        //Think to convert the array to hashset and compare the sizes of them 

        // HashSet<Integer> set = new HashSet<>();
        // boolean flag = false;
        // for(int num: nums){
        //   set.add(num);
        // }
        // if(set.size()!=nums.length){
        //     flag = true;
        // }

        // return flag;
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
        

    }
}