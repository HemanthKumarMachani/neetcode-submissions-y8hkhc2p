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
        for(int num:nums){
            if(numsSet.contains(num-1)) continue;
            else{
                int currentNum = num;
                int currentSub = 1;
                while(numsSet.contains(currentNum+1)){
                    currentNum++; currentSub++;
                }
                longestConsecutiveSequence = Math.max(longestConsecutiveSequence, currentSub);
            }
        }
        return longestConsecutiveSequence;
    }
}
