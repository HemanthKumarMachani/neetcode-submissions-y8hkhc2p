class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums == null || nums.length == 0) return nums;
        int [] ans = new int [2 * nums.length];
        for(int index =0; index< nums.length; index++){
            ans[index] = nums[index];
            ans[nums.length + index] = nums[index];
        }
        return ans;
    }
}