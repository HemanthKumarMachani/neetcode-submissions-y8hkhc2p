class Solution {
    public int[] searchRange(int[] nums, int target) {
        //make sure input is valid
        if (nums == null)
            return new int[] { -1, -1 };
        //finding the first position of the element using binary search
        int low = 0, high = nums.length - 1;
        int[] result = { -1, -1 };
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result[0] = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        //finding the last position of the element
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                result[1] = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}