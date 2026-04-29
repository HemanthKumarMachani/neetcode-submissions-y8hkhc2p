class Solution {
    public int majorityElement(int[] nums) {
        //make sure input is valid
        if (nums == null || nums.length == 0)
            return 0;
        int majorityElement = 0, majorityCount =0;
        //ww'll use Hashmap to store the frequency of each number and the we return the key which appread >= n/2
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            if(frequencyMap.get(num) > majorityCount){
                majorityCount = frequencyMap.get(num);
                majorityElement = num;
            }
        }
        return majorityElement;
    }
}