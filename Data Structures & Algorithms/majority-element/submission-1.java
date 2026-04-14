class Solution {
    public int majorityElement(int[] nums) {
        //make sure input is valid
        if( nums == null || nums.length == 0) return 0;
        int majorityLength = (nums.length % 2 ==0) ? nums.length / 2 : (nums.length/2) +1;
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            int numFreq = freq.getOrDefault(num, 0) +1;
            freq.put(num, numFreq);
            if(numFreq >= majorityLength) return num;
        }
        return 0;
    }
}