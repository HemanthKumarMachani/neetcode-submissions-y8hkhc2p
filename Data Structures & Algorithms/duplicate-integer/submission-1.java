class Solution {
    public boolean hasDuplicate(int[] nums) {
        //make sure input is valid
        if(nums == null || nums.length < 2) return false;
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }
}