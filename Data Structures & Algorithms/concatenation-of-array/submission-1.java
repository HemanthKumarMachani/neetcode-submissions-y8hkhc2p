class Solution {
    public int[] getConcatenation(int[] nums) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return nums; //{1,4,1,2}
        int rightIndex = nums.length; //total nums = 4
        int [] result = new int [2*rightIndex]; // 2*4 = 8
        for(int index = 0; index< nums.length; index++){
            result[index] = nums[index];
            result[rightIndex++] = nums[index];
        }
        return result;
    }
}