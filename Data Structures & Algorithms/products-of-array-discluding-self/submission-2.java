class Solution {
    public int[] productExceptSelf(int[] nums) {
        //make sure input is valid 
        if(nums == null || nums.length == 0) return nums;
        int totalNums = nums.length;
        int [] prefix = new int [totalNums];
        int [] sufix = new int [totalNums];
        int [] result = new int[totalNums];
        if(totalNums>0){
            prefix[0] = 1;
            sufix[totalNums-1] = 1;
        }
        for(int index =1; index< totalNums; index++){ // [1,2,4,6] -> [1,2,8,48]
            prefix[index] = prefix[index-1] * nums[index-1]; 
        }
        for(int sindex = totalNums-2; sindex>=0; sindex--){ //[1,2,4,6] -> [48,12,6,1]
            sufix[sindex] = sufix[sindex+1] * nums[sindex+1];
        }
        for(int resultIndex =0; resultIndex < totalNums; resultIndex++){
            result[resultIndex] = prefix[resultIndex] * sufix[resultIndex]; 
        }
        return result;
    }
}  
