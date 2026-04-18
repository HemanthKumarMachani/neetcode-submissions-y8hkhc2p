class Solution {
    public int longestConsecutive(int[] nums) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int longestConsecutiveSequence = 1;
        Set<Integer> numsSet = new HashSet<>();
        for(int num : nums){
            numsSet.add(num);
        }
        for(int num:numsSet){
            if(!numsSet.contains(num-1)){
                int currentSubSequence = 1;
                while(numsSet.contains(num+currentSubSequence)){
                    currentSubSequence++;
                }
                longestConsecutiveSequence = Math.max(longestConsecutiveSequence, currentSubSequence);
            }
        }
        return longestConsecutiveSequence;
    }
}
