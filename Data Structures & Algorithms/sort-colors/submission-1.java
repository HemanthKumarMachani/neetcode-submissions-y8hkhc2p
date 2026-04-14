class Solution {
    public void sortColors(int[] nums) {
       Map<Integer, Integer> freq = new HashMap<>();
       for(int num : nums){
        freq.put(num, freq.getOrDefault(num, 0)+1);
       }
       int index =0;
       for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
        int key = entry.getKey(), value = entry.getValue();
        while(value>0){
            nums[index++] = key;
            value--;
        }
       }
    }
}