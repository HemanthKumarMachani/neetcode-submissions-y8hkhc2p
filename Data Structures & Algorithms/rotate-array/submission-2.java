class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length; //4
        if(k==0) return;
        //reverse the whole array - {1,2,3,4,5,6,7,8} -> {8,7,6,5,4,3,2,1}
        reverse(nums, 0, nums.length-1);
        //reverse from 0 to k-1 - {8.7,6,5,4,3,2,1} -> {5,6,7,8,4,3,2,1}
        reverse(nums,0,k-1);
        //reverse the rest from k to n-1 - {5,6,7,8,4,3,2,1} -> {5,6,7,8,1,2,3,4}
        reverse(nums,k,nums.length-1);
    }
    public static void reverse(int [] nums,int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}