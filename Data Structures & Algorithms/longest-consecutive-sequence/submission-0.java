class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 && nums==null)return 0;
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longestChain = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)){
                int currentNum = num;
                int currentChainLength = 1;
                while (numSet.contains(currentNum + 1)) {
                    currentNum++; 
                    currentChainLength++; 
                }
                longestChain = Math.max(longestChain, currentChainLength);
            }
        }
        return longestChain;
    }
}
