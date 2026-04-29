class Solution {
    public int majorityElement(int[] nums) {
        //make sure input is valid
        if(nums == null || nums.length == 0) return 0;
        int majorityElement = Integer.MIN_VALUE, majorityCount = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums){
            int currentNumCount = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num,currentNumCount);
            if(currentNumCount > majorityCount){
                majorityCount = currentNumCount;
                majorityElement = num;
            }
        }
        return majorityElement;
    }
}