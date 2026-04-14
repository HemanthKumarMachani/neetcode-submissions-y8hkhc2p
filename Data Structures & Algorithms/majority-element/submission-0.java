class Solution {
    public int majorityElement(int[] nums) {
        //make sure input is valid
        if(nums == null || nums.length ==0) return 0;
        //Moore's voting algorithm -> if a majority element is in the array, it will be leading even if 
        //we encounter other elements
        int count =0, candidate =0;
        for(int num : nums){
            if(count == 0) candidate = num;
            if(num == candidate) count++;
            else count--;
        }
        return candidate;
    }
}