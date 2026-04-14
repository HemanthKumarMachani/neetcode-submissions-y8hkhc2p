class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length == 0) return false;
        Set<Integer> uniques = new HashSet<>();
        for(int num : nums){
            if(uniques.contains(num)) return true;
            uniques.add(num);
        }
        return false;
    }
}