class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for(int num: nums){
            if(num != val) {
                nums[index] = num;
                index++;
            }
        }
        return index;
        //int right = nums.length-1;
        //for(int index = 0; index < nums.length; index++){
          //  int currentNum = nums[index];
          //  if(currentNum == val){
          //      while(nums[right] == val && right > index){
          //          right--;
           //     }
          //      nums[index] = nums[right];
          //      nums[right] = val;
          //  }
      // }
       // return right;
    }
}