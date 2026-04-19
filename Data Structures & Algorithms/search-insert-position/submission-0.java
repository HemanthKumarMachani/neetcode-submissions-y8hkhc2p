class Solution {
    public int searchInsert(int[] nums, int target) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return -1;
        int low = 0, high = nums.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid; //mid stays in play
            }
        }
        return low; // mid == target
    }
}