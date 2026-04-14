class Solution {
    public int[] twoSum(int[] nums, int target) {
        //make sure input is correct
        if(nums == null || nums.length ==0) return new int[2];
        //map to store the reminder and indexes 
        Map<Integer, Integer> complementsIndex = new HashMap<>();
        for(int index = 0; index < nums.length; index++){
            int currentNum = nums[index];
            if(complementsIndex.containsKey(target - currentNum)){
                return new int[] {complementsIndex.get(target - currentNum), index};
            }
            complementsIndex.put(currentNum,index);
        }
        return new int[2];
    }
}
