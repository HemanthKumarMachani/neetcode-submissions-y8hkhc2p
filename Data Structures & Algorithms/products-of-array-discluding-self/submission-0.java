class Solution {
    public int[] productExceptSelf(int[] nums) {
        //make sure input is valid 
        if(nums == null || nums.length == 0) return nums;
        int totalNums = nums.length;
        int [] result = new int[totalNums];
        for(int index = 0; index< totalNums; index++){  //[1,2,4,6]
            int product = 1;
            for(int productIndex = 0; productIndex<totalNums; productIndex++){
                if(index != productIndex){
                    product *= nums[productIndex];
                }
            }
            result[index] = product;
        }
        return result;
    }
}  
