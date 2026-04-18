class Solution {
    public int longestConsecutive(int[] nums) {
        //make sure the input is valid
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return 1;
        int longestSequence = 1, currentMaxSequence = 1;
        //sort the array
        Arrays.sort(nums);
        //iterate to find the longest sequence increasing length currentMaxSequence till we find sequence
        //of elements and updating the longestSequence once we miss the sequence with currentMaxSequence found
        for(int index = 1; index < nums.length; index++){
            if(nums[index] == nums[index-1]+1){
                currentMaxSequence++;
            }else if(nums[index] == nums[index-1]){
                continue;
            }else{
                longestSequence = Math.max(longestSequence, currentMaxSequence);
                currentMaxSequence = 1;
            }
        }
        return Math.max(longestSequence,currentMaxSequence);
    }
}
