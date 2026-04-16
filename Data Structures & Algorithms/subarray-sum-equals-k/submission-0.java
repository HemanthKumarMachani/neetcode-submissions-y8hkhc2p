public class Solution {
    public int subarraySum(int[] nums, int k) {
        int result = 0, currentSum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);
        for (int num : nums) {
            currentSum += num;
            int diff = currentSum - k;
            result += prefixSums.getOrDefault(diff, 0);
            prefixSums.put(currentSum, prefixSums.getOrDefault(currentSum, 0) + 1);
        }
        return result;
    }
}