class Solution {
    public int[] productExceptSelf(int[] nums) {
        //make sure input is valid
        while (nums == null || nums.length == 0)
            return nums;
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        int[] productResult = new int[n];
        if (n > 0) {
            prefixSum[0] = 1;
            suffixSum[n - 1] = 1;
        }
        //build prefixsum array {1,2,4,6} -> {1,2,8,48}
        for (int index = 1; index < n; index++) {
            prefixSum[index] = nums[index - 1] * prefixSum[index - 1];
        }
        //build suffix sum array {1,2,4,6} -> {}
        for (int index = n - 2; index >= 0; index--) {
            suffixSum[index] = nums[index + 1] * suffixSum[index + 1];
        }
        //building product array
        for (int productIdx = 0; productIdx < n; productIdx++) {
            productResult[productIdx] = prefixSum[productIdx] * suffixSum[productIdx];
        }
        return productResult;
    }
}